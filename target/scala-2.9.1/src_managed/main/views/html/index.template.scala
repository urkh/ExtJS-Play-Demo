
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Ejemplo de Play! 2 + ExtJS 4" )/*2.39*/ {_display_(Seq[Any](format.raw/*2.41*/("""
    

    <div id="form-datos"></div>
    <div id="grid-datos"></div>

    
""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 07 23:42:49 VET 2013
                    SOURCE: /home/urkh/playProjects/extjs/app/views/index.scala.html
                    HASH: 7006c97bc1b8c51606b7e36b08cb4047d5227ed6
                    MATRIX: 828->2|873->39|912->41|1020->119
                    LINES: 30->2|30->2|30->2|37->9
                    -- GENERATED --
                */
            