package dto.provider;

public class ProviderDto {

    private String name;
    private String code;
    private String location;
    private String country;

    public ProviderDto(String name, String code, String location, String country) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
