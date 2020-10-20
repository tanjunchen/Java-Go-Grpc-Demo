package com.ctj;

import com.tanjunchen.demo.IstioOperatorProto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UninstallOperation {

    private IstioOperatorProto.IstioOperatorRequest.Operation operation;

    private String namespace;
}