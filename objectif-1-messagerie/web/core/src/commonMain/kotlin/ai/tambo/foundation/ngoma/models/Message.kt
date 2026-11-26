package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.BoolField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class Message : TModel<Message>() {

    var conversation = ModelField(Conversation::class)
    var author = ModelField(User::class)
    var replyTo = ModelField(Message::class).nullable()

    var text = TextField().default("")
    var sentAt = IntField().default(0L)
    var attachment = TextField().default("")

    var isEdited = BoolField().default(false)
    var isDeleted = BoolField().default(false)

    @TMignore var conversation_ by conversation
    @TMignore var author_ by author
    @TMignore var replyTo_ by replyTo
    @TMignore var text_ by text
    @TMignore var sentAt_ by sentAt
    @TMignore var attachment_ by attachment
    @TMignore var isEdited_ by isEdited
    @TMignore var isDeleted_ by isDeleted

    companion object {
        val tms by lazy { Tms(Message::class) }
    }
}
