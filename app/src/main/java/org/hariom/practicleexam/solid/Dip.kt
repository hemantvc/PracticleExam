package org.hariom.practicleexam.solid

class Email{
    fun generateJobAlert(job : String) : String{
        var alert = "You are alerted for:$job"
        return alert
    }
}

class Phone {
    fun generateJobAlert(job: String): String {
        var alert = "You are alerted for:$job"
        return alert
    }
}

class JobTracker(emailParam: Email, phoneParam: Phone) {
     var email : Email
     var phone: Phone
    init {
        email = emailParam
        phone = phoneParam
    }


}