fun showCustomMessage(title:String = "", message:String,  isUrgent:Boolean=true, color:String=":"){
  println("////")
  println("Title : $title")
  println("Message : $message")
  println("Text color : $color")
  println("Urgent : $isUrgent")
}


fun main(args: Array<String>) {

  showCustomMessage(message = "Hello world")
  showCustomMessage(title ="Info",message = "The message is working",color = "Blue")
  showCustomMessage(title = "Warning", message = "A problem occured", isUrgent = true)
  showCustomMessage(title = "Error", message = "An error occured",color = "Red", isUrgent =  true)
}