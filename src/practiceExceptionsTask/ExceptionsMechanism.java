package practiceExceptionsTask;

public class ExceptionsMechanism {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("John", 18, "B2", 190, true, true);
        Candidate candidate2 = new Candidate("Mark", 17, "A1", 186, true, false);
        Candidate candidate3 = new Candidate("Rick", 32, "A1", 184, true, true);
        Candidate candidate4 = new Candidate("John", 28, "C1", 198, false, true);
        Candidate candidate5 = new Candidate("John", 25, "B1", 192, true, true);

        try {
            ArmyRecruitmentAge.ageCriteria(candidate1);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        } finally {
            try {
                ArmyEducationalCriteria.englishLevel(candidate2);
            } catch (Exception e) {
                System.out.println();
                System.out.println("Exception occured: " + e);
            } finally {
                try {
                    ArmyHeightCriteria.heightCriteria(candidate3);
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("Exception occured: " + e);
                } finally {
                    try {
                        ArmyCountryResidentCriteria.countryResident(candidate4);
                    } catch (Exception e) {
                        System.out.println();
                        System.out.println("Exception occured: " + e);
                    } finally {
                        try {
                            ArmyTattoosCriteria.tattoosCriteria(candidate5);
                        } catch (Exception e) {
                            System.out.println();
                            System.out.printf("Exception occured: " + e);
                        }
                    }
                }
            }
            System.out.printf("%nCriteria Done");
        }

    }
}
