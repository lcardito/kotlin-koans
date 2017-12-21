package i_introduction._11_SAM_Conversions

import util.TODO
import util.doc11
import java.util.*

fun todoTask11(): Nothing = TODO(
    """
        Task 11.
        When an object implements a SAM interface (one with a Single Abstract Method), you can pass a lambda instead.
        Rewrite the previous example changing an object expression to a lambda.
    """,
    documentation = doc11()
)

val comparator = Comparator<Int> { o1, o2 -> return@Comparator o2?.compareTo(o1)!! }

fun task11(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, comparator)
    return arrayList
}
