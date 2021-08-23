package revesoft.lib;

import jdk.nashorn.internal.scripts.JO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UserInformationDTO {

    private int upazilaBbsCode;
    private int office_origin_id;
    private int ref_origin_unit_org_id;
    private int is_admin;
    private int office_id;
    private int divisionBbsCode;
    private int uid;
    private String office_name_eng;
    private String upazila_name_eng;
    private String upazila_name_bng;
    private int layer_level;
    private int is_default_role;
    private String office_name_bng;
    private int office_ministry_id;
    private int office_origin_unit_id;
    private int office_head;
    private String designation_bng;
    private int districtBbsCode;
    private int layer_sequence;
    private int employee_record_id;
    private String name_bng;
    private String division_name_bng;
    private int geo_district_id;
    private int office_unit_id;
    private int officeUnitOrganogramId;
    private String unit_name_bng;
    private int geo_upazila_id;
    private String district_name_bng;
    private int geo_division_id;
    private int designation_level;
    private String district_name_eng;
    private String personal_email;

    public UserInformationDTO() {
    }

    public int getUpazilaBbsCode() {
        return upazilaBbsCode;
    }

    public void setUpazilaBbsCode(int upazilaBbsCode) {
        this.upazilaBbsCode = upazilaBbsCode;
    }

    public int getOffice_origin_id() {
        return office_origin_id;
    }

    public void setOffice_origin_id(int office_origin_id) {
        this.office_origin_id = office_origin_id;
    }

    public int getRef_origin_unit_org_id() {
        return ref_origin_unit_org_id;
    }

    public void setRef_origin_unit_org_id(int ref_origin_unit_org_id) {
        this.ref_origin_unit_org_id = ref_origin_unit_org_id;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public int getOffice_id() {
        return office_id;
    }

    public void setOffice_id(int office_id) {
        this.office_id = office_id;
    }

    public int getDivisionBbsCode() {
        return divisionBbsCode;
    }

    public void setDivisionBbsCode(int divisionBbsCode) {
        this.divisionBbsCode = divisionBbsCode;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getOffice_name_eng() {
        return office_name_eng;
    }

    public void setOffice_name_eng(String office_name_eng) {
        this.office_name_eng = office_name_eng;
    }

    public String getUpazila_name_eng() {
        return upazila_name_eng;
    }

    public void setUpazila_name_eng(String upazila_name_eng) {
        this.upazila_name_eng = upazila_name_eng;
    }

    public String getUpazila_name_bng() {
        return upazila_name_bng;
    }

    public void setUpazila_name_bng(String upazila_name_bng) {
        this.upazila_name_bng = upazila_name_bng;
    }

    public int getLayer_level() {
        return layer_level;
    }

    public void setLayer_level(int layer_level) {
        this.layer_level = layer_level;
    }

    public int getIs_default_role() {
        return is_default_role;
    }

    public void setIs_default_role(int is_default_role) {
        this.is_default_role = is_default_role;
    }

    public String getOffice_name_bng() {
        return office_name_bng;
    }

    public void setOffice_name_bng(String office_name_bng) {
        this.office_name_bng = office_name_bng;
    }

    public int getOffice_ministry_id() {
        return office_ministry_id;
    }

    public void setOffice_ministry_id(int office_ministry_id) {
        this.office_ministry_id = office_ministry_id;
    }

    public int getOffice_origin_unit_id() {
        return office_origin_unit_id;
    }

    public void setOffice_origin_unit_id(int office_origin_unit_id) {
        this.office_origin_unit_id = office_origin_unit_id;
    }

    public int getOffice_head() {
        return office_head;
    }

    public void setOffice_head(int office_head) {
        this.office_head = office_head;
    }

    public String getDesignation_bng() {
        return designation_bng;
    }

    public void setDesignation_bng(String designation_bng) {
        this.designation_bng = designation_bng;
    }

    public int getDistrictBbsCode() {
        return districtBbsCode;
    }

    public void setDistrictBbsCode(int districtBbsCode) {
        this.districtBbsCode = districtBbsCode;
    }

    public int getLayer_sequence() {
        return layer_sequence;
    }

    public void setLayer_sequence(int layer_sequence) {
        this.layer_sequence = layer_sequence;
    }

    public int getEmployee_record_id() {
        return employee_record_id;
    }

    public void setEmployee_record_id(int employee_record_id) {
        this.employee_record_id = employee_record_id;
    }

    public String getName_bng() {
        return name_bng;
    }

    public void setName_bng(String name_bng) {
        this.name_bng = name_bng;
    }

    public String getDivision_name_bng() {
        return division_name_bng;
    }

    public void setDivision_name_bng(String division_name_bng) {
        this.division_name_bng = division_name_bng;
    }

    public int getGeo_district_id() {
        return geo_district_id;
    }

    public void setGeo_district_id(int geo_district_id) {
        this.geo_district_id = geo_district_id;
    }

    public int getOffice_unit_id() {
        return office_unit_id;
    }

    public void setOffice_unit_id(int office_unit_id) {
        this.office_unit_id = office_unit_id;
    }

    public int getOfficeUnitOrganogramId() {
        return officeUnitOrganogramId;
    }

    public void setOfficeUnitOrganogramId(int officeUnitOrganogramId) {
        this.officeUnitOrganogramId = officeUnitOrganogramId;
    }

    public String getUnit_name_bng() {
        return unit_name_bng;
    }

    public void setUnit_name_bng(String unit_name_bng) {
        this.unit_name_bng = unit_name_bng;
    }

    public int getGeo_upazila_id() {
        return geo_upazila_id;
    }

    public void setGeo_upazila_id(int geo_upazila_id) {
        this.geo_upazila_id = geo_upazila_id;
    }

    public String getDistrict_name_bng() {
        return district_name_bng;
    }

    public void setDistrict_name_bng(String district_name_bng) {
        this.district_name_bng = district_name_bng;
    }

    public int getGeo_division_id() {
        return geo_division_id;
    }

    public void setGeo_division_id(int geo_division_id) {
        this.geo_division_id = geo_division_id;
    }

    public int getDesignation_level() {
        return designation_level;
    }

    public void setDesignation_level(int designation_level) {
        this.designation_level = designation_level;
    }

    public String getDistrict_name_eng() {
        return district_name_eng;
    }

    public void setDistrict_name_eng(String district_name_eng) {
        this.district_name_eng = district_name_eng;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public static UserInformationDTO parseJson(String data) throws ParseException {
        JSONArray jsonArray = (JSONArray) new JSONParser().parse(data);
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        UserInformationDTO userInformationDTO = new UserInformationDTO();
        userInformationDTO.setName_bng((String) jsonObject.get("name_bng"));

        return userInformationDTO;
    }
}
