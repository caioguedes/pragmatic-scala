def mail(destination: String = "Head Office", mailClass: String = "first") =
  println(s"sending to $destination by $mailClass class")

mail("Houston Office", "Priority")
mail("Boston Office")
mail()
