package com.amaromerovic.moreonkotlin

fun main() {

    val mobilePhone = MobilePhone("2965404")

    var contact = Contact("Amar", "50445")
    val contactOne = Contact("Edis", "987877488")
    mobilePhone.addNewContact(contact)
    contact = Contact("Bilal", "8518418")
    mobilePhone.addNewContact(contact)
    mobilePhone.printContact()
    println("=========================================================================================================")

    mobilePhone.updateContact(contact, contactOne)
    mobilePhone.printContact()
    println("=========================================================================================================")

    mobilePhone.removeContact(contactOne)
    mobilePhone.printContact()
    println("=========================================================================================================")
    val query = mobilePhone.queryContact("Amar")
    println("${query.name} ${query.phoneNumber}")


}


class MobilePhone(myNumber: String) {
    var myContacts: ArrayList<Contact>
    private var myNumber: String

    init {
        this.myNumber = myNumber
        myContacts = ArrayList()
    }


    fun addNewContact(contact: Contact): Boolean {
        if (myContacts.contains(contact)) {
            return false
        }
        myContacts.add(contact)
        return true
    }

    fun updateContact(oldContact: Contact, newContact: Contact): Boolean {
        if (myContacts.contains(oldContact)) {
            myContacts.set(findContact(oldContact), newContact)
            return true
        }
        return false
    }

    fun removeContact(contact: Contact): Boolean {
        return myContacts.remove(contact)
    }

    private fun findContact(contact: Contact): Int {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact)
        }
        return -1
    }

    private fun findContact(contactName: String): Int {
        for (i in myContacts) {
            if (i.name == contactName) {
                return myContacts.indexOf(i)
            }
        }

        return -1
    }

    fun queryContact(contactName: String): Contact {
        return myContacts[findContact(contactName)]
    }

    fun printContact() {
        for (contact in myContacts) {
            println("${contact.name} -> ${contact.phoneNumber}")
        }
    }


}


class Contact(name: String, phoneNumber: String) {
    var name: String
        private set
    var phoneNumber: String
        private set

    init {
        this.name = name
        this.phoneNumber = phoneNumber
    }
}