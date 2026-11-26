package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.BoolField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class PostComment : TModel<PostComment>() {

    var post = ModelField(Post::class)
    var author = ModelField(User::class)
    var parent = ModelField(PostComment::class).nullable()

    var text = TextField().default("")
    var createdAt = IntField().default(0L)

    var isEdited = BoolField().default(false)
    var isDeleted = BoolField().default(false)

    @TMignore var post_ by post
    @TMignore var author_ by author
    @TMignore var parent_ by parent
    @TMignore var text_ by text
    @TMignore var createdAt_ by createdAt
    @TMignore var isEdited_ by isEdited
    @TMignore var isDeleted_ by isDeleted

    companion object {
        val tms by lazy { Tms(PostComment::class) }
    }
}
