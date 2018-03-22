/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.php.core.net;
import io.vertx.lang.php.util.Wrapper;

/**
 A self-signed certificate helper for testing and development purposes.
 <p>
 While it helps for testing and development, it should never ever be used in production settings.

 * @class
 */
@Name("SelfSignedCertificate")
@Namespace("io\\vertx\\php\\core\\net")
public class SelfSignedCertificate extends BaseWrapper<SelfSignedCertificate>{

  /**
   Provides the {@link KeyCertOptions} RSA private key file in PEM format corresponding to the {@link SelfSignedCertificate#privateKeyPath}

   @public

   @return {Object} a <a href="../../dataobjects.html#PemKeyCertOptions">PemKeyCertOptions</a> based on the generated certificate.
   */
  this.keyCertOptions = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnDataObject(j_selfSignedCertificate.keyCertOptions());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Provides the {@link TrustOptions} X.509 certificate file in PEM format corresponding to the {@link SelfSignedCertificate#certificatePath}

   @public

   @return {Object} a <a href="../../dataobjects.html#PemTrustOptions">PemTrustOptions</a> based on the generated certificate.
   */
  this.trustOptions = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnDataObject(j_selfSignedCertificate.trustOptions());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Filesystem path to the RSA private key file in PEM format

   @public

   @return {string} the absolute path to the private key.
   */
  this.privateKeyPath = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_selfSignedCertificate.privateKeyPath();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Filesystem path to the X.509 certificate file in PEM format .

   @public

   @return {string} the absolute path to the certificate.
   */
  this.certificatePath = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_selfSignedCertificate.certificatePath();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete the private key and certificate files.

   @public

   */
  this.delete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_selfSignedCertificate.delete();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_selfSignedCertificate;
};

SelfSignedCertificate._jclass = utils.getJavaClass("io.vertx.core.net.SelfSignedCertificate");
SelfSignedCertificate._jtype = {
  accept: function(obj) {
    return SelfSignedCertificate._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SelfSignedCertificate.prototype, {});
    SelfSignedCertificate.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SelfSignedCertificate._create = function(jdel) {
  var obj = Object.create(SelfSignedCertificate.prototype, {});
  SelfSignedCertificate.apply(obj, arguments);
  return obj;
}
/**
 Create a new <code>SelfSignedCertificate</code> instance with a fully-qualified domain name,

 @memberof module:vertx-js/self_signed_certificate
 @param fqdn {string} a fully qualified domain name. 
 @return {SelfSignedCertificate} a new instance.
 */
SelfSignedCertificate.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(SelfSignedCertificate, JSelfSignedCertificate.create());
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(SelfSignedCertificate, JSelfSignedCertificate.create(__args[0]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = SelfSignedCertificate;