package com.project.vetProject.core.config;

import com.project.vetProject.core.config.modelMapper.IModelMapperService;
import com.project.vetProject.core.exception.NotFoundException;
import com.project.vetProject.core.utilies.Msg;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Configuration
public class ConvertEntityToResponse<E, RESPONSE> {
    private final IModelMapperService modelMapperService;
    public List<RESPONSE> convertToResponseList(List<E> entityList, Class<RESPONSE> responseClass) {
        if (entityList.isEmpty()){
            throw new NotFoundException(Msg.NOT_FOUND);
        } else {
            return entityList.stream()
                    .map(entity -> modelMapperService.forResponse().map(entity, responseClass))
                    .collect(Collectors.toList());
        }
    }
    public List<RESPONSE> convertToResponsePage(Page<E> entityList, Class<RESPONSE> responseClass) {
        if (entityList.isEmpty()){
            throw new NotFoundException(Msg.NOT_FOUND);
        } else {
            return entityList.stream()
                    .map(entity -> modelMapperService.forResponse().map(entity, responseClass))
                    .collect(Collectors.toList());
        }
    }
}
