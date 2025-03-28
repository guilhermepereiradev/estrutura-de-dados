package com.oxd.website;

import java.util.Objects;

public class Website implements Comparable<Website> {

    private Long id;
    private String url;

    public Website(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Website that = (Website) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Website o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "WebsiteHistory{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
