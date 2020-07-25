#include <jni.h>
#include "strlen.h"
#include <stdio.h>
#include <string.h>

JNIEXPORT jint JNICALL
Java_com_tutego_jni_StrLen_strlen( JNIEnv *env, jclass clazz, jstring s ) {
/*  printf( "Hallo Java-Freunde!\n" ); */

  if ( s == NULL ) {
    jclass exc = (*env)->FindClass( env, "java/lang/NullPointerException" );

    if ( exc != NULL )
      (*env)->ThrowNew( env, exc, "(in C code)" );

    return -1;
  }

  const char* str = (*env)->GetStringUTFChars( env, s, NULL );

  if ( str == NULL )
    return -1;

  int len = strlen( str );

  (*env)->ReleaseStringUTFChars( env, s, str );

  return (jint) len;

/* return 0; */
}