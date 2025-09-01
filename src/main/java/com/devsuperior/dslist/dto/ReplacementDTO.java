package com.devsuperior.dslist.dto;

public class ReplacementDTO{
    private Integer sourceIndex;
    private Integer DestinationIndex;

    public Integer getSourceIndex(){
        return sourceIndex;
    }

    public void setSourceIndex( Integer sourceIndex ){
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex(){
        return DestinationIndex;
    }

    public void setDestinationIndex( Integer destinationIndex ){
        DestinationIndex = destinationIndex;
    }
}
