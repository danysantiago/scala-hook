package controllers

import play.Logger
import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def git = Action { request =>
    val body = request.body
    println(body)
    Ok("Cool")
  }

}