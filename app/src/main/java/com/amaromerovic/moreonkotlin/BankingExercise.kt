package com.amaromerovic.moreonkotlin

fun main() {
    val bank = Bank("National Australia Bank")
    bank.addBranch("Adelaide")

    bank.addCustomer("Adelaide", "Tim", 50.05)
    bank.addCustomer("Adelaide", "Mike", 175.34)
    bank.addCustomer("Adelaide", "Percy", 220.12)

    bank.addCustomerTransaction("Adelaide", "Tim", 44.22)
    bank.addCustomerTransaction("Adelaide", "Tim", 12.44)
    bank.addCustomerTransaction("Adelaide", "Mike", 1.65)

    bank.listCustomers("Adelaide", true)

    println("\n******************************************************************\n")

    bank.listCustomers("Adelaide", false)
}

class Customer(name: String, initialTransaction: Double) {
    val name: String
    val transactions: ArrayList<Double>
    val initialTransaction: Double

    init {
        this.name = name
        this.transactions = ArrayList()
        this.initialTransaction = initialTransaction
        this.transactions.add(initialTransaction)
    }

    fun addTransaction(transaction: Double): Boolean {
        return transactions.add(transaction)
    }
}

class Branch(name: String) {
    val name: String
    val customers: ArrayList<Customer>

    init {
        this.name = name
        this.customers = ArrayList()
    }

    fun newCustomer(name: String, initialTransaction: Double): Boolean {
        if (findCustomer(name) == null) {
            return customers.add(Customer(name, initialTransaction))
        }
        return false
    }

    fun addCustomerTransaction(name: String, transaction: Double): Boolean {
        val customer = findCustomer(name)
        customer?.let {
            return it.addTransaction(transaction)
        }
        return false
    }

    private fun findCustomer(name: String): Customer? {
        for (i in customers) {
            if (i.name == name) {
                return i
            }
        }
        return null
    }
}

class Bank(name: String) {
    val name: String
    val branches: ArrayList<Branch>

    init {
        this.name = name
        this.branches = ArrayList()
    }

    fun addBranch(name: String): Boolean {
        if (findBranch(name) == null) {
            return branches.add(Branch(name))
        }
        return false
    }

    fun addCustomer(branchName: String, customerName: String, initialTransaction: Double): Boolean {
        val branch = findBranch(branchName)
        branch?.let {
            it.newCustomer(customerName, initialTransaction)
            return true
        }
        return false
    }

    fun addCustomerTransaction(
        branchName: String,
        customerName: String,
        transaction: Double
    ): Boolean {
        val branch = findBranch(branchName)
        branch?.let { itOne ->
            return itOne.addCustomerTransaction(customerName, transaction)
        }
        return false
    }

    fun listCustomers(branchName: String, printTransaction: Boolean): Boolean {
        val branch = findBranch(branchName)
        branch?.let {
            println("Customer details for branch ${it.name}")
            for (i in 0 until it.customers.size) {
                println("Customer: ${it.customers[i].name}[${i + 1}]")
                if (printTransaction) {
                    println("Transactions")
                    for (j in 0 until it.customers[i].transactions.size) {
                        println("[${j + 1}] Amount ${it.customers[i].transactions[j]}")
                    }
                }
            }
            return true
        }
        return false
    }

    private fun findBranch(name: String): Branch? {
        for (i in branches) {
            if (i.name == name) {
                return i
            }
        }
        return null
    }

}