package assignment;

import accesscontrol.User;
import util.GraderObject;

import java.util.Date;

/** An AssignemntSubmission contains an Assignment representing the specific
 *  assignment to be submitted, and a Date representign the date and time of the
 *  submission.
 */

public class AssignmentSubmission implements GraderObject {
   User user;
   Assignment assignment;
   Date timestamp;
}
