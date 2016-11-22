// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface TraceOptsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TraceOpts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Length of the trace to be taken, in seconds.
   * </pre>
   *
   * <code>optional double duration = 1;</code>
   */
  double getDuration();

  /**
   * <pre>
   * If true, capture step profile locally in each worker. Currently
   * unimplemented.
   * </pre>
   *
   * <code>optional bool use_step_profiler = 2;</code>
   */
  boolean getUseStepProfiler();

  /**
   * <pre>
   * If true, capture kernel events from each worker.
   * </pre>
   *
   * <code>optional bool use_kernel_profiler = 3;</code>
   */
  boolean getUseKernelProfiler();

  /**
   * <pre>
   * If true, capture extended profiling events from TensorFlow process.
   * </pre>
   *
   * <code>optional bool use_extended_profiler = 4;</code>
   */
  boolean getUseExtendedProfiler();

  /**
   * <pre>
   * If true, capture GPU profiling events locally on each
   * machine. Currently unimplemented.
   * </pre>
   *
   * <code>optional bool use_gpu_profiler = 5;</code>
   */
  boolean getUseGpuProfiler();

  /**
   * <pre>
   * If true, collect sampled profile events. Currently unimplemented.
   * </pre>
   *
   * <code>optional bool use_sample_profiler = 6;</code>
   */
  boolean getUseSampleProfiler();
}