package controllers;


import play.mvc.*;
import views.html.*;
import play.data.Form;
import play.libs.Json;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Dato;

public class Datos extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }

    public static Result crear() {
      Form<Dato> formDato = form(Dato.class).bindFromRequest();
      formDato.get().save();
      String id = formDato.field("id").value();

      if(id.equals("0")){

        List<Dato> datos = Dato.buscar.all();
        return ok(Json.toJson(datos));
        
      }else{

        Map<String, String> response = new HashMap<String, String>();
        response.put("success", "1");
        response.put("msg", "Los datos de guardaron exitosamente!");
        return ok(Json.toJson(response));
        
      }
      
    }


    public static Result listar() {
      List<Dato> datos = Dato.buscar.all();
      return ok(Json.toJson(datos));
    }

    public static Result actualizar() {
      Form<Dato> formDato = form(Dato.class).bindFromRequest();

      Long id = Long.parseLong(formDato.field("id").value());
      formDato.get().update(id);
      
      Map<String, String> resultado=new HashMap<String, String>();
      resultado.put("success", "1");
      resultado.put("msg", "Los datos se modificaron");
      return ok(Json.toJson(resultado));

    }

   public static Result eliminar() {
      Form<Dato> formDato = form(Dato.class).bindFromRequest();
      Long id = Long.parseLong(formDato.field("id").value());
      Dato.buscar.ref(id).delete();
      Map<String, String> resultado=new HashMap<String, String>();
      resultado.put("success", "1");
      resultado.put("msg", "Datos eliminados");
      return ok(Json.toJson(resultado));
    }
  
}
