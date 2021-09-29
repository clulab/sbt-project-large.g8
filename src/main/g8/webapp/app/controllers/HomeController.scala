package controllers

import com.typesafe.config.Config
import com.typesafe.config.ConfigRenderOptions

import javax.inject._
import org.clulab.wm.eidos.EidosSystem
import org.clulab.wm.eidos.groundings.MaaSHandler
import org.clulab.wm.eidos.serialization.jsonld.JLDCorpus
import org.clulab.wm.eidos.serialization.web.BuildInfoObj
import org.clulab.wm.eidos.serialization.web.WebSerializer
import org.clulab.wm.eidos.utils.{DisplayUtils, PlayUtils}
import play.api.mvc._
import play.api.libs.json._
import play.api.mvc.Action

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val $class;format="decap"$ = $class$()
  val classMessage = $class;format="decap"$.getArgString("$class$.message", Some("Class message not found!"))

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def hello: Action[AnyContent] = Action {
    Ok(classMessage).as(JSON)
  }
}
