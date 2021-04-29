package com.gypsey.shopifyapp.dbconnection.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

import java.io.Serializable

@Entity(tableName = "UserLocalData")
class UserLocalData : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "firstname")
    var firstname: String? = null

    @ColumnInfo(name = "customer_id")
    var customer_id: String? = null

    @ColumnInfo(name = "lastname")
    var lastname: String? = null

    @ColumnInfo(name = "email")
    var email: String? = null

    @ColumnInfo(name = "password")
    var password: String? = null

    constructor(id: Int, firstname: String, lastname: String, email: String, password: String) {
        this.id = id
        this.firstname = firstname
        this.lastname = lastname
        this.email = email
        this.password = password
    }

    @Ignore
    constructor(customer_id:String,firstname: String, lastname: String, email: String, password: String) {

        this.customer_id = customer_id
        this.firstname = firstname
        this.lastname = lastname
        this.email = email
        this.password = password
    }
}
