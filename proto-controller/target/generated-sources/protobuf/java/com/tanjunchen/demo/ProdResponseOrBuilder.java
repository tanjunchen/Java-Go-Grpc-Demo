// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prod/prod.proto

package com.tanjunchen.demo;

public interface ProdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:prod.ProdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 商品库存
   * </pre>
   *
   * <code>int32 prod_stock = 1;</code>
   */
  int getProdStock();

  /**
   * <code>.status.Status status = 2;</code>
   */
  boolean hasStatus();
  /**
   * <code>.status.Status status = 2;</code>
   */
  com.tanjunchen.demo.Status getStatus();
  /**
   * <code>.status.Status status = 2;</code>
   */
  com.tanjunchen.demo.StatusOrBuilder getStatusOrBuilder();
}
