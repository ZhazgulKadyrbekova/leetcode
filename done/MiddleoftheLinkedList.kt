package done

import util.ListNode

/**
 * Example:
 * var li = util.ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class util.ListNode(var `val`: Int) {
 *     var next: util.ListNode? = null
 * }
 */
fun middleNode(head: ListNode?): ListNode? {
    var counter = 1
    var midNode: ListNode? = head
    var node = head
    while (node?.next != null) {
        node = node.next
        counter++
        if (counter % 2 == 0) {
            midNode = midNode?.next
        }
    }
    return midNode
}
