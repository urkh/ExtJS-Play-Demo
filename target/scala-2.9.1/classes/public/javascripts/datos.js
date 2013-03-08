Ext.Loader.setConfig({
    enabled: true
});

Ext.Loader.setPath('Ext.ux', '../ux');

Ext.require([
    'Ext.form.*',
    'Ext.grid.*',
    'Ext.data.*',
    'Ext.util.*',
    'Ext.state.*',
]);

Ext.onReady(function() {


    Ext.define('Datos',{
        extend: 'Ext.data.Model',
        fields: [
            {name: 'id', type: 'int'},
            {name: 'nombre', type: 'string'},
            {name: 'apellido', type: 'string'},
            {name: 'fechaNac', type: 'date', dateFormat: 'Y-m-d'},
            {name: 'correo', type: 'string'},
        ]
    });
    
    var store = Ext.create('Ext.data.Store', {
        model: 'Datos',
        autoLoad: true,
        autoSync: true,
        autoDestroy: true,
        proxy: {
            type: 'ajax',
            api: { 
                read: "/listar",
                create: "/crear",
                update: "/actualizar",
                destroy: "/eliminar"
            },
            reader: {
                type: 'json',
                idProperty: 'id',
            },
            writer:{
               type: 'json', 
               writeAllFields: false, 
            },  
        }
    });

    var rowEditor = Ext.create('Ext.grid.plugin.RowEditing', {
        clicksToMoveEditor: 1,
        saveBtnText  : 'Guardar',
        cancelBtnText: 'Cancelar'
    });

    var gridPanel = Ext.create('Ext.grid.Panel', {
        store: store,
        renderTo: 'grid-datos',
        width: 600,
        height: 300,
        title: 'Editar Datos',
        frame: true,
        plugins: [rowEditor],
        columns: [

            {hidden: true, header: 'id', dataIndex: 'id'}, 

            {header: 'Nombre', dataIndex: 'nombre', flex: 1, 
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            }, 

            {header: 'Apellido', dataIndex: 'apellido', flex: 1, 
                editor: {
                    xtype: 'textfield',
                    allowBlank: false
                }
            }, 
            
            {header: 'Fecha de Nacimiento', dataIndex: 'fechaNac', width: 160, renderer: Ext.util.Format.dateRenderer('Y-m-d'),
                editor: {
                    xtype: 'datefield', 
                    allowBlank: false,
                    format: 'Y-m-d'
                }
            }, 

            {header: 'Correo', dataIndex: 'correo', width: 180,
                editor: {
                    xtype: 'textfield',
                    vtype: 'email',
                    allowBlank: false
                }
            }, 

        ],

        tbar: [{
            text: 'Agregar',
            handler : function() {
                rowEditor.cancelEdit();
                var r = Ext.create('Datos', {
                    id: '',
                    nombre: 'Nombre',
                    apellido: 'Apellido',
                    fechaNac: '2012-12-31',
                    correo: 'correo@dominio.com'
                });

                store.insert(0, r);
                rowEditor.startEdit(0, 0);
            }
        }, '-', {
            itemId: 'eliminar',
            text: 'Eliminar',
            handler: function() {
                var sm = gridPanel.getSelectionModel();
                rowEditor.cancelEdit();
                store.remove(sm.getSelection());
                if (store.getCount() > 0) {
                    sm.select(0);
                }
            },
            disabled: true
        }],

        listeners: {
            'selectionchange': function(view, records) {
                gridPanel.down('#eliminar').setDisabled(!records.length);
            }
        }

    });



    var formPanel = Ext.create('Ext.form.Panel', {
        frame: true,
        title: 'Datos',
        renderTo: 'form-datos',
        width: 340,
        bodyPadding: 5,
        fieldDefaults: {
            labelAlign: 'left',
            labelWidth: 90,
            anchor: '100%'
        },

        items: [

            {xtype: 'textfield', name: 'nombre', fieldLabel: 'Nombre', allowBlank: false},

            {xtype: 'textfield', name: 'apellido', fieldLabel: 'Apellido', allowBlank: false},

            {xtype: 'datefield', format: 'Y-m-d', name: 'fechaNac', fieldLabel: 'Fecha Nacimiento', allowBlank: false},

            {xtype: 'textfield', vtype: 'email', name: 'correo', fieldLabel: 'Correo', allowBlank: false}

        ],


        buttons: [{
            text: 'Guardar',
            handler: function() {
                var valores = formPanel.getValues();
                Ext.Ajax.request({
                    url: '/crear',
                    params: valores,
                    success: function(response){
                        var response = Ext.decode(response.responseText);
                        Ext.Msg.show({
                            title: 'Info',
                            msg: response.msg,
                            buttons: Ext.MessageBox.OK,
                            icon: Ext.MessageBox.INFO
                        });
                        store.load();
                    },
                    failure: function(form, action){
                        Ext.Msg.show({
                            title: 'Info',
                            msg: "No se pudieron guardar los datos",
                            buttons: Ext.MessageBox.OK,
                            icon: Ext.MessageBox.ERROR
                        });
                    }
                });
            }

        },{
            text: 'Cancelar',
            handler: function() {
                formPanel.getForm().reset();
            }
        }]
    });
});