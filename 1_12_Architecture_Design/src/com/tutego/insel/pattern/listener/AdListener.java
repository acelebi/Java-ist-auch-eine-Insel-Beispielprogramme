package com.tutego.insel.pattern.listener;

import java.util.EventListener;

/** The listener interface for receiving ad events. */
interface AdListener extends EventListener {

  /** Invoked when an ad occurs. */
  void advertisement( AdEvent e );
}
