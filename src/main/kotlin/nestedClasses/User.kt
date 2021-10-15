package nestedClasses

class User(val username:String, password:String) {
    class PasswordManager(val password: String){
        fun checkPassword(entry:String):Boolean{
            return (password== entry)
        }
    }
    val passwordManager = PasswordManager(password)
}