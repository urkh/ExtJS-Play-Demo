
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("javascripts/ext4/resources/css/ext-all.css"))),format.raw/*10.117*/("""" />
    	<script type="text/javascript" src=""""),_display_(Seq[Any](/*11.43*/routes/*11.49*/.Assets.at("javascripts/ext4/ext-all.js"))),format.raw/*11.90*/(""""></script>

        <!--Descomentar para habilitar el theme neptune -->
        <!-- <script type="text/javascript" src=""""),_display_(Seq[Any](/*14.51*/routes/*14.57*/.Assets.at("javascripts/ext4/ext-neptune.js"))),format.raw/*14.102*/(""""></script> -->
        <!-- <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*15.60*/routes/*15.66*/.Assets.at("javascripts/ext4/resources/css/ext-neptune.css"))),format.raw/*15.126*/("""" /> -->

    	<script type="text/javascript"  src=""""),_display_(Seq[Any](/*17.44*/routes/*17.50*/.Assets.at("javascripts/datos.js"))),format.raw/*17.84*/(""""></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*20.10*/content)),format.raw/*20.17*/("""
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*21.46*/routes/*21.52*/.Assets.at("javascripts/ext4/locale/ext-lang-es.js"))),format.raw/*21.104*/(""""></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 08 00:48:43 VET 2013
                    SOURCE: /home/urkh/playProjects/extjs/app/views/main.scala.html
                    HASH: 725006912bac923072fad6ab6e83e56506d45bb1
                    MATRIX: 759->1|866->31|954->84|980->89|1077->151|1091->157|1146->191|1242->252|1256->258|1309->290|1402->347|1417->353|1496->409|1579->456|1594->462|1657->503|1816->626|1831->632|1899->677|2010->752|2025->758|2108->818|2197->871|2212->877|2268->911|2348->955|2377->962|2459->1008|2474->1014|2549->1066
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|44->15|44->15|44->15|46->17|46->17|46->17|49->20|49->20|50->21|50->21|50->21
                    -- GENERATED --
                */
            