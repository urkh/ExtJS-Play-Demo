
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

        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("javascripts/ext4/resources/css/ext-all.css"))),format.raw/*11.117*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.55*/routes/*12.61*/.Assets.at("javascripts/ext4/resources/css/ext-neptune.css"))),format.raw/*12.121*/("""" /> 
        
    	<script type="text/javascript" src=""""),_display_(Seq[Any](/*14.43*/routes/*14.49*/.Assets.at("javascripts/ext4/ext-all.js"))),format.raw/*14.90*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*15.46*/routes/*15.52*/.Assets.at("javascripts/ext4/ext-neptune.js"))),format.raw/*15.97*/(""""></script>
    	<script type="text/javascript"  src=""""),_display_(Seq[Any](/*16.44*/routes/*16.50*/.Assets.at("javascripts/datos.js"))),format.raw/*16.84*/(""""></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*19.10*/content)),format.raw/*19.17*/("""
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*20.46*/routes/*20.52*/.Assets.at("javascripts/ext4/locale/ext-lang-es.js"))),format.raw/*20.104*/(""""></script>
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
                    DATE: Fri Mar 08 00:26:40 VET 2013
                    SOURCE: /home/urkh/playProjects/extjs/app/views/main.scala.html
                    HASH: 28a3d25f006ad0b072d49a4c1518180c4b59aa81
                    MATRIX: 759->1|866->31|954->84|980->89|1077->151|1091->157|1146->191|1242->252|1256->258|1309->290|1403->348|1418->354|1497->410|1592->469|1607->475|1690->535|1783->592|1798->598|1861->639|1954->696|1969->702|2036->747|2127->802|2142->808|2198->842|2278->886|2307->893|2389->939|2404->945|2479->997
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|48->19|48->19|49->20|49->20|49->20
                    -- GENERATED --
                */
            