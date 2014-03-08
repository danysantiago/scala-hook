package controllers

import play.api._
import play.api.mvc._
import scala.sys.process._

object Application extends Controller {

  def index = Action {
    Ok("Scala-Hook up and listening!")
  }

  def git = Action(parse.json) { request =>
    (request.body \ "ref").asOpt[String].map { ref =>
      if (ref.equals("refs/heads/master"))
        println("sh script.sh"!!)
      Ok("All Good!")
    }.getOrElse {
      BadRequest("Bad JSON Payload, is this a Git Hook?")
    }
  }

}