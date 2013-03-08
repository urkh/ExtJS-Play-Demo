// @SOURCE:/home/urkh/playProjects/extjs/conf/routes
// @HASH:d48ee82f3e837608839ba1f9db5655d90de3b557
// @DATE:Fri Mar 08 00:26:37 VET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Datos_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Datos_crear1 = Route("POST", PathPattern(List(StaticPart("/crear"))))
                    

// @LINE:8
val controllers_Datos_listar2 = Route("GET", PathPattern(List(StaticPart("/listar"))))
                    

// @LINE:9
val controllers_Datos_actualizar3 = Route("POST", PathPattern(List(StaticPart("/actualizar"))))
                    

// @LINE:10
val controllers_Datos_eliminar4 = Route("POST", PathPattern(List(StaticPart("/eliminar"))))
                    

// @LINE:13
val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Datos.index()"""),("""POST""","""/crear""","""controllers.Datos.crear()"""),("""GET""","""/listar""","""controllers.Datos.listar()"""),("""POST""","""/actualizar""","""controllers.Datos.actualizar()"""),("""POST""","""/eliminar""","""controllers.Datos.eliminar()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Datos_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Datos.index(), HandlerDef(this, "controllers.Datos", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Datos_crear1(params) => {
   call { 
        invokeHandler(_root_.controllers.Datos.crear(), HandlerDef(this, "controllers.Datos", "crear", Nil))
   }
}
                    

// @LINE:8
case controllers_Datos_listar2(params) => {
   call { 
        invokeHandler(_root_.controllers.Datos.listar(), HandlerDef(this, "controllers.Datos", "listar", Nil))
   }
}
                    

// @LINE:9
case controllers_Datos_actualizar3(params) => {
   call { 
        invokeHandler(_root_.controllers.Datos.actualizar(), HandlerDef(this, "controllers.Datos", "actualizar", Nil))
   }
}
                    

// @LINE:10
case controllers_Datos_eliminar4(params) => {
   call { 
        invokeHandler(_root_.controllers.Datos.eliminar(), HandlerDef(this, "controllers.Datos", "eliminar", Nil))
   }
}
                    

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                