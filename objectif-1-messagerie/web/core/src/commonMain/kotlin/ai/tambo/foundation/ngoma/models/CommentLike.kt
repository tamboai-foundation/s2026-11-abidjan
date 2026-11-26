package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class CommentLike : TModel<CommentLike>() {

    var comment = ModelField(PostComment::class)
    var user = ModelField(User::class)
    var createdAt = IntField().default(0L)

    @TMignore var comment_ by comment
    @TMignore var user_ by user
    @TMignore var createdAt_ by createdAt

    companion object {
        val tms by lazy { Tms(CommentLike::class) }
    }
}
