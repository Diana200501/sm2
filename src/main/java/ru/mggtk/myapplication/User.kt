package ru.mggtk.myapplication
import java.io.Serializable
class User(): Serializable{
    private var name: String = ""
    private var company: String = ""
    private var age: Int = 0

    constructor(_name: String, _company: String, _age: Int) : this(){
        name = _name
        company = _company
        age = _age
    }

    fun setName(_name: String){
        name = _name
    }

    fun getName(): String {
        return name
    }

    fun setCompany(_company: String){
        company = _company
    }
    fun getCompany(): String {
        return company
    }

    fun setAge(_age: Int){
        age = _age
    }

    fun getAge(): Int{
        return age
    }


}