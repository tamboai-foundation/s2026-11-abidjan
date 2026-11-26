package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class User : TModel<User>() {

    var name = TextField().default("")
    var bio = TextField().default("")
    var joinedAt = IntField().default(0L)

    @TMignore var name_ by name
    @TMignore var bio_ by bio
    @TMignore var joinedAt_ by joinedAt

    companion object {
        val tms by lazy { Tms(User::class) }
    }
}
