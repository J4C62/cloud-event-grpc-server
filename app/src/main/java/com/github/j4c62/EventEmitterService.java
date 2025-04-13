package com.github.j4c62;

import com.github.j4c62.infrastructure.grcp.EventEmitterGrpc;
import com.github.j4c62.infrastructure.grcp.EventRequest;
import com.github.j4c62.infrastructure.grcp.EventResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EventEmitterService extends EventEmitterGrpc.EventEmitterImplBase {

  /**
   * @param request
   * @param responseObserver
   */
  @Override
  public void emitEvent(EventRequest request, StreamObserver<EventResponse> responseObserver) {
    EventResponse eventResponse =
        EventResponse.newBuilder().setMessage("Recived").setStatus("200").build();
    responseObserver.onNext(eventResponse);
    responseObserver.onCompleted();
  }
}
