package com.question1

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidations("Kirti@ 1234")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidations("Rakhi#Pareek")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidations("Rakhi2$")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidations("Rakhi@pareek2000")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidations("RAKHI@PAREEK2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidations("rakhi@pareek2")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidations("RakhiPareek2")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid" in {
    val password = new PasswordValidations("Rakhi@Pareek08")
    assert(password.passwordIsValid)
  }
}