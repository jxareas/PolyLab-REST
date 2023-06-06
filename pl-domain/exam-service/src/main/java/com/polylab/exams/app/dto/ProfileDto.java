package com.polylab.exams.app.dto;

import com.jxareas.jxelerator.domain.model.MutableIdentifiable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto implements MutableIdentifiable<Integer> {
    private Integer profileId;
    private String description;
    private Integer status;

    @Override
    public Integer getId() {
        return profileId;
    }

    @Override
    public void setId(Integer identifier) {
        profileId = identifier;
    }
}
