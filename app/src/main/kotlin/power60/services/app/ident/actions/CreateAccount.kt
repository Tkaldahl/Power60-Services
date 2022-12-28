package power60.services.app.ident.actions

import org.bson.Document
import power60.services.app.ident.services.IdentMongoClient

class CreateAccount {

    fun main(): Boolean {
        val account: Document = Document("firstName", "Taylor")
            .append("lastName", "Kaldahl")

        val result = IdentMongoClient.createAccount(account)
        return result.wasAcknowledged()
    }
}