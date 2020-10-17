package practiceExceptionsTask;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }

    public static void validateCriteria(Candidate candidate) throws CustomException {
        try {
            ArmyRecruitmentAge.ageCriteria(candidate);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        } finally {
            try {
                ArmyEducationalCriteria.englishLevel(candidate);
            } catch (Exception e) {
                System.out.println("Exception occured: " + e);
            } finally {
                try {
                    ArmyHeightCriteria.heightCriteria(candidate);
                } catch (Exception e) {
                    System.out.println("Exception occured: " + e);
                } finally {
                    try {
                        ArmyCountryResidentCriteria.countryResident(candidate);
                    } catch (Exception e) {
                        System.out.println("Exception occured: " + e);
                    } finally {
                        try {
                            ArmyTattoosCriteria.tattoosCriteria(candidate);
                        } catch (Exception e) {
                            System.out.println();
                            System.out.printf("Exception occured: " + e);
                        }
                    }
                }
            }
            System.out.println();
            System.out.printf("\nCRITERIA DONE");
        }
    }

}

class ArmyRecruitmentAge {

    static void ageCriteria(Candidate o1) throws CustomException {
        if (o1.getAge() < 18)
            throw new CustomException("The candidate is under 18 years old, not admitted.");
        else
            System.out.println("Congratulations: AGE CRITERIA " +
                    "has been verified");
    }
}

class ArmyEducationalCriteria {
    static void englishLevel(Candidate o1) throws CustomException {
        if (o1.getEnglishlevel().equals("A1"))
            throw new CustomException("Low English Level, minimum chances of selection.");
        else
            System.out.println("Congratulations: ENGLISH LEVEL " +
                    "CRITERIA has been verified");
    }
}

class ArmyHeightCriteria {
    static void heightCriteria(Candidate o1) throws CustomException {
        if (o1.getHeight() < 185)
            throw new CustomException("Minimum height standards of the soldiers it is 185 CM.");
        else
            System.out.println("Congratulations: HEIGHT " +
                    "CRITERIA has been verified");
    }
}

class ArmyCountryResidentCriteria {
    static void countryResident(Candidate o1) throws CustomException {
        if (o1.getCountryResident() == false)
            throw new CustomException("Unfortunately you are not a resident of the country" +
                    " only residents are admitted in Phase ONE.");
        else
            System.out.println("Congratulations: COUNTRY " +
                    "RESIDENT CRITERIA has been verified");
    }
}

class ArmyTattoosCriteria {
    static void tattoosCriteria(Candidate o1) throws CustomException {
        if (o1.getTattoosOrpiercings() == true)
            throw new CustomException("Unfortunately, tattoos or piercings can be a reason for refusal " +
                    "for Phase TWO selection. \nIt is mandatory to present these elements to the doctor during " +
                    "the passage of the medical commission.");
        else
            System.out.println("Congratulations: TATTOOS OR " +
                    "PIERCINGS CRITERIA has been verified");
    }
}




