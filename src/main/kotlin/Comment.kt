import java.util.*

data class Comment( /* data classes automatically generate getter and setter methods for properties defined in the primary constructor
                        and automatically generate componentN(), copy(), equals(), hashCode(), toString() methods */
    var userNick: String,
    var userId: String,
    var retime: Date
) : Comparable<Comment> { // implements the Comparable interface with the type parameter Comment
    override fun compareTo(other: Comment): Int { // instances of the Comment class can be compared to each other based on a natural order defined by the compareTo method
        return retime.compareTo(other.retime) // to compare Date objects for ordering
    }
    override fun toString(): String {
        return "Comment [userNick=$userNick, userId=$userId, retime=$retime]"
    }
}

/*
this.retime is before other.retime -> returns a negative value
this.retime is after other.retime -> returns a positive value
this.retime and other.retime -> returns 0
 */