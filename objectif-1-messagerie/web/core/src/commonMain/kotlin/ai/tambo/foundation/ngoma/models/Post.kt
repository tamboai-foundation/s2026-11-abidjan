package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.TextField
import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.BoolField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class Post : TModel<Post>() {

    var author = ModelField(User::class)
    var caption = TextField().default("")
    var mediaUrl = TextField().default("")
    var mediaType = TextField().default("image")
    var createdAt = IntField().default(0L)
    var isEdited = BoolField().default(false)

    @TMignore var author_ by author
    @TMignore var caption_ by caption
    @TMignore var mediaUrl_ by mediaUrl
    @TMignore var mediaType_ by mediaType
    @TMignore var createdAt_ by createdAt
    @TMignore var isEdited_ by isEdited

    companion object {
        val tms by lazy { Tms(Post::class) }
    }
}
