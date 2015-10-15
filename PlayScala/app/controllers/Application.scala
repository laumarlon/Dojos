package controllers

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import models.Person;
import models.{Person,DB}
import play.api.libs.json.Json

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  val formPerson: Form[Person] = Form{
    mapping(
      "name" -> text,
      "age" -> number
      )(Person.apply)(Person.unapply)
  }
  
  def addPerson = Action{ implicit request =>
    val persons = formPerson.bindFromRequest.get
    DB.save(persons)
    Redirect(routes.Application.index)    
  }
  
  def getPerson = Action{
    val person = DB.query[Person].fetch
    Ok(Json.toJson(person))
  }

  def getByAge(a:Int) = Action {
    val persons = DB.query[Person].fetch    
    val (minors, adults) =  persons Partition(_.age < 18)
    if (a==1) Ok(Json.toJson(adults)) else Ok(Json.toJson(minors))
  }

  def savePerson = Action { implicit request =>
    DB.save(Person(name,age))
    Redirect(routes.Application.index)
  }
   
}
