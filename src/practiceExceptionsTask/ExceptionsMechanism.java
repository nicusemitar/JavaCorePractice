package practiceExceptionsTask;

public class ExceptionsMechanism {
    public static void main(String[] args) throws CustomException {

        Candidate candidate1 = new Candidate("John", 18, "B2", 190, true, true);
        Candidate candidate2 = new Candidate("Mark", 17, "A1", 187, true, true);
        Candidate candidate3 = new Candidate("Rick", 32, "A1", 184, true, true);
        Candidate candidate4 = new Candidate("John", 28, "C1", 198, false, true);
        Candidate candidate5 = new Candidate("John", 25, "B1", 192, false, false);

        CustomException.validateCriteria(candidate3);

    }
}
