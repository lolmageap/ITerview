package cherhy.jung.gptinterview.util

import org.hibernate.annotations.Where

// 유틸인 애들도 잇고, 아닌 애들도 있어 보여요. 공통이라는 패키지로 뺄 수 있는애들은 뺴볼까요?
@Where(clause = "deleted = false")
abstract class BaseDeleteEntity() : BaseEntity() {
    var deleted: Boolean = false
}
