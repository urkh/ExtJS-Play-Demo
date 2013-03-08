// @SOURCE:/home/urkh/playProjects/extjs/conf/routes
// @HASH:d48ee82f3e837608839ba1f9db5655d90de3b557
// @DATE:Fri Mar 08 00:48:39 VET 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseDatos {
    


 
// @LINE:10
def eliminar() = {
   Call("POST", "/eliminar")
}
                                                        
 
// @LINE:8
def listar() = {
   Call("GET", "/listar")
}
                                                        
 
// @LINE:9
def actualizar() = {
   Call("POST", "/actualizar")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:7
def crear() = {
   Call("POST", "/crear")
}
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseDatos {
    


 
// @LINE:10
def eliminar = JavascriptReverseRoute(
   "controllers.Datos.eliminar",
   """
      function() {
      return _wA({method:"POST", url:"/eliminar"})
      }
   """
)
                                                        
 
// @LINE:8
def listar = JavascriptReverseRoute(
   "controllers.Datos.listar",
   """
      function() {
      return _wA({method:"GET", url:"/listar"})
      }
   """
)
                                                        
 
// @LINE:9
def actualizar = JavascriptReverseRoute(
   "controllers.Datos.actualizar",
   """
      function() {
      return _wA({method:"POST", url:"/actualizar"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Datos.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:7
def crear = JavascriptReverseRoute(
   "controllers.Datos.crear",
   """
      function() {
      return _wA({method:"POST", url:"/crear"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseDatos {
    


 
// @LINE:10
def eliminar() = new play.api.mvc.HandlerRef(
   controllers.Datos.eliminar(), HandlerDef(this, "controllers.Datos", "eliminar", Seq())
)
                              
 
// @LINE:8
def listar() = new play.api.mvc.HandlerRef(
   controllers.Datos.listar(), HandlerDef(this, "controllers.Datos", "listar", Seq())
)
                              
 
// @LINE:9
def actualizar() = new play.api.mvc.HandlerRef(
   controllers.Datos.actualizar(), HandlerDef(this, "controllers.Datos", "actualizar", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Datos.index(), HandlerDef(this, "controllers.Datos", "index", Seq())
)
                              
 
// @LINE:7
def crear() = new play.api.mvc.HandlerRef(
   controllers.Datos.crear(), HandlerDef(this, "controllers.Datos", "crear", Seq())
)
                              

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                