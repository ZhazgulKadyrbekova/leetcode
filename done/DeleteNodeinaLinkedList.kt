import util.ListNode

fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(2)
    val li3 = ListNode(3)
    val li4 = ListNode(1)
//    val li5 = util.ListNode(4)
//    val li6 = util.ListNode(5)
//    val li7 = util.ListNode(6)
    li1.next = li2
    li2.next = li3
    li3.next = li4
//    li4.next = li5
//    li5.next = li6
//    li6.next = li7

    deleteNode(li3)
}
fun deleteNode(node: ListNode?) {
    val next = node?.next!!

    node.`val` = next.`val`
    node.next = next.next
}
