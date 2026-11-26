package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.BoolField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class Conversation : TModel<Conversation>() {

    var title = TextField().default("")
    var createdAt = IntField().default(0L)
    var isGroup = BoolField().default(false)

    @TMignore var title_ by title
    @TMignore var createdAt_ by createdAt
    @TMignore var isGroup_ by isGroup

    companion object {
        val tms by lazy { Tms(Conversation::class) }
    }
}
