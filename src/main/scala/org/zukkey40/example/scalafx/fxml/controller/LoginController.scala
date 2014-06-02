package org.zukkey40.example.scalafx.fxml.controller

import scalafx.Includes._
import javafx.scene.control.{TextField => jfxTextField, PasswordField => jfxPasswordField, Button => jfxButton}
import javafx.fxml.{Initializable, FXML}
import java.util.ResourceBundle
import java.net.URL
import scalafx.scene.control.{TextField => sfxTextField, PasswordField => sfxPasswordField, Button => sfxButton}
import scalafx.event.ActionEvent

/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/06/01
 * To change this template use File | Settings | File Templates.
 */
class LoginController extends Initializable{
  @FXML val jfxUsernameField: jfxTextField = null
  @FXML val jfxPasswordField: jfxPasswordField = null
  @FXML val jfxOkButton: jfxButton = null
  @FXML val jfxCancelButton: jfxButton = null

  private var sfxUsernameField: sfxTextField = null
  private var sfxPasswordField: sfxPasswordField = null
  private var sfxOkButton: sfxButton = null
  private var sfxCancelButton: sfxButton = null

  def initialize(url: URL, resourceBundle: ResourceBundle){
    sfxUsernameField = new sfxTextField(jfxUsernameField)
    sfxPasswordField = new sfxPasswordField(jfxPasswordField)
    sfxOkButton = new sfxButton(jfxOkButton)
    sfxCancelButton = new sfxButton(jfxCancelButton)

    sfxOkButton.onAction = (_: ActionEvent) => {
      println("OK button is clicked")
    }
  }
}
