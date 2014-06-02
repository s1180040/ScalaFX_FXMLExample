package org.zukkey40.example.scalafx.fxml

import scalafx.Includes._
import javafx.fxml.FXMLLoader
import javafx.scene.{Parent => jfxParent}
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/06/01
 * To change this template use File | Settings | File Templates.
 */
object Main extends JFXApp{
  val root: jfxParent = FXMLLoader.load(getClass.getResource("view/Login.fxml"))

  stage = new PrimaryStage() {
    title = "FXML example"
    scene = new Scene(root)
  }
}
