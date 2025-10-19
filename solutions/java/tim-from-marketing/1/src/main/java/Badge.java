class Badge {
    public String print(Integer id, String name, String department) {
        String departmentInfo = (department == null) ? "OWNER" : department.toUpperCase();
        String idInfo = (id == null) ? "" : String.format("[%d] - ", id);

        return String.format("%s%s - %s", idInfo, name, departmentInfo);
    }
}