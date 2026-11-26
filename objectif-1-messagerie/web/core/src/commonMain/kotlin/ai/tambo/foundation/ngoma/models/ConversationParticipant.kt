package ai.tambo.foundation.ngoma.models

import ai.tambo.tmodeler.field.common.IntField
import ai.tambo.tmodeler.field.advanced.BoolField
import ai.tambo.tmodeler.field.advanced.ModelField
import ai.tambo.tmodeler.model.TModel
import ai.tambo.tmodeler.model.TMignore
import ai.tambo.tmodeler.ms.Tms

class ConversationParticipant : TModel<ConversationParticipant>() {

    var user = ModelField(User::class)
    var conversation = ModelField(Conversation::class)
    var joinedAt = IntField().default(0L)
    var unreadCount = IntField().default(0L)

    var isPinned = BoolField().default(false)
    var isMuted = BoolField().default(false)
    var isArchived = BoolField().default(false)

    @TMignore var user_ by user
    @TMignore var conversation_ by conversation
    @TMignore var joinedAt_ by joinedAt
    @TMignore var unreadCount_ by unreadCount
    @TMignore var isPinned_ by isPinned
    @TMignore var isMuted_ by isMuted
    @TMignore var isArchived_ by isArchived

    companion object {
        val tms by lazy { Tms(ConversationParticipant::class) }
    }
}
