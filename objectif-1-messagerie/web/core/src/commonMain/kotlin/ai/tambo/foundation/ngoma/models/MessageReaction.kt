package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class MessageReaction : TModel<MessageReaction>() {

    var message = ModelField(Message::class)
    var user = ModelField(User::class)
    var emoji = TextField().default("")
    var createdAt = IntField().default(0L)

    @TMignore var message_ by message
    @TMignore var user_ by user
    @TMignore var emoji_ by emoji
    @TMignore var createdAt_ by createdAt

    companion object {
        val tms by lazy { Tms(MessageReaction::class) }
    }
}
