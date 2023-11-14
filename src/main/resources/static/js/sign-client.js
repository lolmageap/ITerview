!function () {
    function utils() {
        var n = {};
        return n.exports = function (t, s) {
            var r = {};

            function o(n, e, t, r) {
                return n.addEventListener(e, t, r)
            }

            function i(n) {
                return "string" == typeof n
            }

            function a(n, e) {
                return n.getAttribute(e)
            }

            function u(n, e, t) {
                return n.setAttribute(e, t)
            }

            return {
                addClass: function (n, e) {
                    if (n.classList) return n.classList.add(e);
                    var t = n.className.split(" ");
                    -1 === t.indexOf(e) && (t.push(e), n.className = t.join(" "))
                }, toggleClass: function (n, e) {
                    if (n.classList) return n.classList.toggle(e);
                    var t = n.className.split(" "), r = t.indexOf(e);
                    -1 !== r ? t.splice(r, 1) : t.push(e), n.className = t.join(" ")
                }, hasClass: function (n, e) {
                    return n.classList ? n.classList.contains(e) : -1 !== n.className.split(" ").indexOf(e)
                }, addClickListener: function (n, e) {
                    return o(n, "click", e)
                }, addEventListener: o, getAttribute: a, getElementById: function (n) {
                    return s.getElementById(n)
                }, getParent: function (n) {
                    return n.parentNode
                }, isString: i, loadScript: function (n, e) {
                    var t = s.createElement("script");
                    for (var r in e) t[r] = e[r];
                    t.src = n, s.body.appendChild(t)
                }, poll: function (n) {
                    var o = n.interval || 2e3, e = n.url || t.location.href, i = n.condition || function () {
                        return !0
                    }, a = n.onSuccess || function () {
                    }, u = n.onError || function () {
                    };
                    return setTimeout(function r() {
                        var s = new XMLHttpRequest;
                        return s.open("GET", e), s.setRequestHeader("Accept", "application/json"), s.onload = function () {
                            if (200 === s.status) {
                                var n = "application/json" === s.getResponseHeader("Content-Type").split(";")[0] ? JSON.parse(s.responseText) : s.responseText;
                                return i(n) ? a() : setTimeout(r, o)
                            }
                            if (429 !== s.status) return u({status: s.status, responseText: s.responseText});
                            var e = 1e3 * Number.parseInt(s.getResponseHeader("X-RateLimit-Reset")),
                                t = e - (new Date).getTime();
                            return setTimeout(r, o < t ? t : o)
                        }, s.send()
                    }, o)
                }, querySelector: function (n, e) {
                    return i(n) ? s.querySelector(n) : n.querySelector(e)
                }, querySelectorAll: function (n, e) {
                    var t = i(n) ? s.querySelectorAll(n) : n.querySelectorAll(e);
                    return Array.prototype.slice.call(t)
                }, removeClass: function (n, e) {
                    if (n.classList) return n.classList.remove(e);
                    var t = n.className.split(" "), r = t.indexOf(e);
                    -1 !== r && (t.splice(r, 1), n.className = t.join(" "))
                }, removeElement: function (n) {
                    return n.remove()
                }, setAttribute: u, removeAttribute: function (n, e) {
                    return n.removeAttribute(e)
                }, swapAttributes: function (n, e, t) {
                    var r = a(n, e), s = a(n, t);
                    u(n, t, r), u(n, e, s)
                }, setGlobalFlag: function (n, e) {
                    r[n] = !!e
                }, getGlobalFlag: function (n) {
                    return !!r[n]
                }, preventFormSubmit: function (n) {
                    n.stopPropagation(), n.preventDefault()
                }, matchMedia: function (n) {
                    return "function" != typeof t.matchMedia && t.matchMedia(n).matches
                }, dispatchEvent: function (n, e, t) {
                    var r;
                    "function" != typeof Event ? (r = s.createEvent("Event")).initCustomEvent(e, t, !1) : r = new Event(e, {bubbles: t}), n.dispatchEvent(r)
                }, setTimeout: setTimeout, timeoutPromise: function (n, s) {
                    return new Promise(function (e, t) {
                        var r = setTimeout(function () {
                            t(new Error("timeoutPromise: promise timed out"))
                        }, n);
                        s.then(function (n) {
                            clearTimeout(r), e(n)
                        }, function (n) {
                            clearTimeout(r), t(n)
                        })
                    })
                }, createMutationObserver: function (n) {
                    return "undefined" == typeof MutationObserver ? null : new MutationObserver(n)
                }
            }
        }, n.exports
    }

    function passwordSheriffBundle() {
        var module = {
            exports: function () {
                return function (t) {
                    var r = {};

                    function s(n) {
                        if (r[n]) return r[n].exports;
                        var e = r[n] = {i: n, l: !1, exports: {}};
                        return t[n].call(e.exports, e, e.exports, s), e.l = !0, e.exports
                    }

                    return s.m = t, s.c = r, s.d = function (n, e, t) {
                        s.o(n, e) || Object.defineProperty(n, e, {enumerable: !0, get: t})
                    }, s.r = function (n) {
                        "undefined" != typeof Symbol && Symbol.toStringTag && Object.defineProperty(n, Symbol.toStringTag, {value: "Module"}), Object.defineProperty(n, "__esModule", {value: !0})
                    }, s.t = function (e, n) {
                        if (1 & n && (e = s(e)), 8 & n) return e;
                        if (4 & n && "object" == typeof e && e && e.__esModule) return e;
                        var t = Object.create(null);
                        if (s.r(t), Object.defineProperty(t, "default", {
                            enumerable: !0,
                            value: e
                        }), 2 & n && "string" != typeof e) for (var r in e) s.d(t, r, function (n) {
                            return e[n]
                        }.bind(null, r));
                        return t
                    }, s.n = function (n) {
                        var e = n && n.__esModule ? function () {
                            return n.default
                        } : function () {
                            return n
                        };
                        return s.d(e, "a", e), e
                    }, s.o = function (n, e) {
                        return Object.prototype.hasOwnProperty.call(n, e)
                    }, s.p = "", s(s.s = "./src/index.js")
                }({
                    "./node_modules/inherits/inherits_browser.js": function (module, exports) {
                        eval("if (typeof Object.create === 'function') {\n  // implementation from standard node.js 'util' module\n  module.exports = function inherits(ctor, superCtor) {\n    ctor.super_ = superCtor\n    ctor.prototype = Object.create(superCtor.prototype, {\n      constructor: {\n        value: ctor,\n        enumerable: false,\n        writable: true,\n        configurable: true\n      }\n    });\n  };\n} else {\n  // old school shim for old browsers\n  module.exports = function inherits(ctor, superCtor) {\n    ctor.super_ = superCtor\n    var TempCtor = function () {}\n    TempCtor.prototype = superCtor.prototype\n    ctor.prototype = new TempCtor()\n    ctor.prototype.constructor = ctor\n  }\n}\n\n\n//# sourceURL=webpack:///./node_modules/inherits/inherits_browser.js?")
                    }, "./node_modules/process/browser.js": function (module, exports) {
                        eval("// shim for using process in browser\nvar process = module.exports = {};\n\n// cached from whatever global is present so that test runners that stub it\n// don't break things.  But we need to wrap it in a try catch in case it is\n// wrapped in strict mode code which doesn't define any globals.  It's inside a\n// function because try/catches deoptimize in certain engines.\n\nvar cachedSetTimeout;\nvar cachedClearTimeout;\n\nfunction defaultSetTimout() {\n    throw new Error('setTimeout has not been defined');\n}\nfunction defaultClearTimeout () {\n    throw new Error('clearTimeout has not been defined');\n}\n(function () {\n    try {\n        if (typeof setTimeout === 'function') {\n            cachedSetTimeout = setTimeout;\n        } else {\n            cachedSetTimeout = defaultSetTimout;\n        }\n    } catch (e) {\n        cachedSetTimeout = defaultSetTimout;\n    }\n    try {\n        if (typeof clearTimeout === 'function') {\n            cachedClearTimeout = clearTimeout;\n        } else {\n            cachedClearTimeout = defaultClearTimeout;\n        }\n    } catch (e) {\n        cachedClearTimeout = defaultClearTimeout;\n    }\n} ())\nfunction runTimeout(fun) {\n    if (cachedSetTimeout === setTimeout) {\n        //normal enviroments in sane situations\n        return setTimeout(fun, 0);\n    }\n    // if setTimeout wasn't available but was latter defined\n    if ((cachedSetTimeout === defaultSetTimout || !cachedSetTimeout) && setTimeout) {\n        cachedSetTimeout = setTimeout;\n        return setTimeout(fun, 0);\n    }\n    try {\n        // when when somebody has screwed with setTimeout but no I.E. maddness\n        return cachedSetTimeout(fun, 0);\n    } catch(e){\n        try {\n            // When we are in I.E. but the script has been evaled so I.E. doesn't trust the global object when called normally\n            return cachedSetTimeout.call(null, fun, 0);\n        } catch(e){\n            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error\n            return cachedSetTimeout.call(this, fun, 0);\n        }\n    }\n\n\n}\nfunction runClearTimeout(marker) {\n    if (cachedClearTimeout === clearTimeout) {\n        //normal enviroments in sane situations\n        return clearTimeout(marker);\n    }\n    // if clearTimeout wasn't available but was latter defined\n    if ((cachedClearTimeout === defaultClearTimeout || !cachedClearTimeout) && clearTimeout) {\n        cachedClearTimeout = clearTimeout;\n        return clearTimeout(marker);\n    }\n    try {\n        // when when somebody has screwed with setTimeout but no I.E. maddness\n        return cachedClearTimeout(marker);\n    } catch (e){\n        try {\n            // When we are in I.E. but the script has been evaled so I.E. doesn't  trust the global object when called normally\n            return cachedClearTimeout.call(null, marker);\n        } catch (e){\n            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error.\n            // Some versions of I.E. have different rules for clearTimeout vs setTimeout\n            return cachedClearTimeout.call(this, marker);\n        }\n    }\n\n\n\n}\nvar queue = [];\nvar draining = false;\nvar currentQueue;\nvar queueIndex = -1;\n\nfunction cleanUpNextTick() {\n    if (!draining || !currentQueue) {\n        return;\n    }\n    draining = false;\n    if (currentQueue.length) {\n        queue = currentQueue.concat(queue);\n    } else {\n        queueIndex = -1;\n    }\n    if (queue.length) {\n        drainQueue();\n    }\n}\n\nfunction drainQueue() {\n    if (draining) {\n        return;\n    }\n    var timeout = runTimeout(cleanUpNextTick);\n    draining = true;\n\n    var len = queue.length;\n    while(len) {\n        currentQueue = queue;\n        queue = [];\n        while (++queueIndex < len) {\n            if (currentQueue) {\n                currentQueue[queueIndex].run();\n            }\n        }\n        queueIndex = -1;\n        len = queue.length;\n    }\n    currentQueue = null;\n    draining = false;\n    runClearTimeout(timeout);\n}\n\nprocess.nextTick = function (fun) {\n    var args = new Array(arguments.length - 1);\n    if (arguments.length > 1) {\n        for (var i = 1; i < arguments.length; i++) {\n            args[i - 1] = arguments[i];\n        }\n    }\n    queue.push(new Item(fun, args));\n    if (queue.length === 1 && !draining) {\n        runTimeout(drainQueue);\n    }\n};\n\n// v8 likes predictible objects\nfunction Item(fun, array) {\n    this.fun = fun;\n    this.array = array;\n}\nItem.prototype.run = function () {\n    this.fun.apply(null, this.array);\n};\nprocess.title = 'browser';\nprocess.browser = true;\nprocess.env = {};\nprocess.argv = [];\nprocess.version = ''; // empty string to avoid regexp issues\nprocess.versions = {};\n\nfunction noop() {}\n\nprocess.on = noop;\nprocess.addListener = noop;\nprocess.once = noop;\nprocess.off = noop;\nprocess.removeListener = noop;\nprocess.removeAllListeners = noop;\nprocess.emit = noop;\nprocess.prependListener = noop;\nprocess.prependOnceListener = noop;\n\nprocess.listeners = function (name) { return [] }\n\nprocess.binding = function (name) {\n    throw new Error('process.binding is not supported');\n};\n\nprocess.cwd = function () { return '/' };\nprocess.chdir = function (dir) {\n    throw new Error('process.chdir is not supported');\n};\nprocess.umask = function() { return 0; };\n\n\n//# sourceURL=webpack:///./node_modules/process/browser.js?")
                    }, "./node_modules/util/support/isBufferBrowser.js": function (module, exports) {
                        eval("module.exports = function isBuffer(arg) {\n  return arg && typeof arg === 'object'\n    && typeof arg.copy === 'function'\n    && typeof arg.fill === 'function'\n    && typeof arg.readUInt8 === 'function';\n}\n\n//# sourceURL=webpack:///./node_modules/util/support/isBufferBrowser.js?")
                    }, "./node_modules/util/util.js": function (module, exports, __webpack_require__) {
                        eval("/* WEBPACK VAR INJECTION */(function(process) {// Copyright Joyent, Inc. and other Node contributors.\n//\n// Permission is hereby granted, free of charge, to any person obtaining a\n// copy of this software and associated documentation files (the\n// \"Software\"), to deal in the Software without restriction, including\n// without limitation the rights to use, copy, modify, merge, publish,\n// distribute, sublicense, and/or sell copies of the Software, and to permit\n// persons to whom the Software is furnished to do so, subject to the\n// following conditions:\n//\n// The above copyright notice and this permission notice shall be included\n// in all copies or substantial portions of the Software.\n//\n// THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS\n// OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF\n// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN\n// NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,\n// DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR\n// OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE\n// USE OR OTHER DEALINGS IN THE SOFTWARE.\n\nvar getOwnPropertyDescriptors = Object.getOwnPropertyDescriptors ||\n  function getOwnPropertyDescriptors(obj) {\n    var keys = Object.keys(obj);\n    var descriptors = {};\n    for (var i = 0; i < keys.length; i++) {\n      descriptors[keys[i]] = Object.getOwnPropertyDescriptor(obj, keys[i]);\n    }\n    return descriptors;\n  };\n\nvar formatRegExp = /%[sdj%]/g;\nexports.format = function(f) {\n  if (!isString(f)) {\n    var objects = [];\n    for (var i = 0; i < arguments.length; i++) {\n      objects.push(inspect(arguments[i]));\n    }\n    return objects.join(' ');\n  }\n\n  var i = 1;\n  var args = arguments;\n  var len = args.length;\n  var str = String(f).replace(formatRegExp, function(x) {\n    if (x === '%%') return '%';\n    if (i >= len) return x;\n    switch (x) {\n      case '%s': return String(args[i++]);\n      case '%d': return Number(args[i++]);\n      case '%j':\n        try {\n          return JSON.stringify(args[i++]);\n        } catch (_) {\n          return '[Circular]';\n        }\n      default:\n        return x;\n    }\n  });\n  for (var x = args[i]; i < len; x = args[++i]) {\n    if (isNull(x) || !isObject(x)) {\n      str += ' ' + x;\n    } else {\n      str += ' ' + inspect(x);\n    }\n  }\n  return str;\n};\n\n\n// Mark that a method should not be used.\n// Returns a modified function which warns once by default.\n// If --no-deprecation is set, then it is a no-op.\nexports.deprecate = function(fn, msg) {\n  if (typeof process !== 'undefined' && process.noDeprecation === true) {\n    return fn;\n  }\n\n  // Allow for deprecating things in the process of starting up.\n  if (typeof process === 'undefined') {\n    return function() {\n      return exports.deprecate(fn, msg).apply(this, arguments);\n    };\n  }\n\n  var warned = false;\n  function deprecated() {\n    if (!warned) {\n      if (process.throwDeprecation) {\n        throw new Error(msg);\n      } else if (process.traceDeprecation) {\n        console.trace(msg);\n      } else {\n        console.error(msg);\n      }\n      warned = true;\n    }\n    return fn.apply(this, arguments);\n  }\n\n  return deprecated;\n};\n\n\nvar debugs = {};\nvar debugEnviron;\nexports.debuglog = function(set) {\n  if (isUndefined(debugEnviron))\n    debugEnviron = process.env.NODE_DEBUG || '';\n  set = set.toUpperCase();\n  if (!debugs[set]) {\n    if (new RegExp('\\\\b' + set + '\\\\b', 'i').test(debugEnviron)) {\n      var pid = process.pid;\n      debugs[set] = function() {\n        var msg = exports.format.apply(exports, arguments);\n        console.error('%s %d: %s', set, pid, msg);\n      };\n    } else {\n      debugs[set] = function() {};\n    }\n  }\n  return debugs[set];\n};\n\n\n/**\n * Echos the value of a value. Trys to print the value out\n * in the best way possible given the different types.\n *\n * @param {Object} obj The object to print out.\n * @param {Object} opts Optional options object that alters the output.\n */\n/* legacy: obj, showHidden, depth, colors*/\nfunction inspect(obj, opts) {\n  // default options\n  var ctx = {\n    seen: [],\n    stylize: stylizeNoColor\n  };\n  // legacy...\n  if (arguments.length >= 3) ctx.depth = arguments[2];\n  if (arguments.length >= 4) ctx.colors = arguments[3];\n  if (isBoolean(opts)) {\n    // legacy...\n    ctx.showHidden = opts;\n  } else if (opts) {\n    // got an \"options\" object\n    exports._extend(ctx, opts);\n  }\n  // set default options\n  if (isUndefined(ctx.showHidden)) ctx.showHidden = false;\n  if (isUndefined(ctx.depth)) ctx.depth = 2;\n  if (isUndefined(ctx.colors)) ctx.colors = false;\n  if (isUndefined(ctx.customInspect)) ctx.customInspect = true;\n  if (ctx.colors) ctx.stylize = stylizeWithColor;\n  return formatValue(ctx, obj, ctx.depth);\n}\nexports.inspect = inspect;\n\n\n// http://en.wikipedia.org/wiki/ANSI_escape_code#graphics\ninspect.colors = {\n  'bold' : [1, 22],\n  'italic' : [3, 23],\n  'underline' : [4, 24],\n  'inverse' : [7, 27],\n  'white' : [37, 39],\n  'grey' : [90, 39],\n  'black' : [30, 39],\n  'blue' : [34, 39],\n  'cyan' : [36, 39],\n  'green' : [32, 39],\n  'magenta' : [35, 39],\n  'red' : [31, 39],\n  'yellow' : [33, 39]\n};\n\n// Don't use 'blue' not visible on cmd.exe\ninspect.styles = {\n  'special': 'cyan',\n  'number': 'yellow',\n  'boolean': 'yellow',\n  'undefined': 'grey',\n  'null': 'bold',\n  'string': 'green',\n  'date': 'magenta',\n  // \"name\": intentionally not styling\n  'regexp': 'red'\n};\n\n\nfunction stylizeWithColor(str, styleType) {\n  var style = inspect.styles[styleType];\n\n  if (style) {\n    return '\\u001b[' + inspect.colors[style][0] + 'm' + str +\n           '\\u001b[' + inspect.colors[style][1] + 'm';\n  } else {\n    return str;\n  }\n}\n\n\nfunction stylizeNoColor(str, styleType) {\n  return str;\n}\n\n\nfunction arrayToHash(array) {\n  var hash = {};\n\n  array.forEach(function(val, idx) {\n    hash[val] = true;\n  });\n\n  return hash;\n}\n\n\nfunction formatValue(ctx, value, recurseTimes) {\n  // Provide a hook for user-specified inspect functions.\n  // Check that value is an object with an inspect function on it\n  if (ctx.customInspect &&\n      value &&\n      isFunction(value.inspect) &&\n      // Filter out the util module, it's inspect function is special\n      value.inspect !== exports.inspect &&\n      // Also filter out any prototype objects using the circular check.\n      !(value.constructor && value.constructor.prototype === value)) {\n    var ret = value.inspect(recurseTimes, ctx);\n    if (!isString(ret)) {\n      ret = formatValue(ctx, ret, recurseTimes);\n    }\n    return ret;\n  }\n\n  // Primitive types cannot have properties\n  var primitive = formatPrimitive(ctx, value);\n  if (primitive) {\n    return primitive;\n  }\n\n  // Look up the keys of the object.\n  var keys = Object.keys(value);\n  var visibleKeys = arrayToHash(keys);\n\n  if (ctx.showHidden) {\n    keys = Object.getOwnPropertyNames(value);\n  }\n\n  // IE doesn't make error fields non-enumerable\n  // http://msdn.microsoft.com/en-us/library/ie/dww52sbt(v=vs.94).aspx\n  if (isError(value)\n      && (keys.indexOf('message') >= 0 || keys.indexOf('description') >= 0)) {\n    return formatError(value);\n  }\n\n  // Some type of object without properties can be shortcutted.\n  if (keys.length === 0) {\n    if (isFunction(value)) {\n      var name = value.name ? ': ' + value.name : '';\n      return ctx.stylize('[Function' + name + ']', 'special');\n    }\n    if (isRegExp(value)) {\n      return ctx.stylize(RegExp.prototype.toString.call(value), 'regexp');\n    }\n    if (isDate(value)) {\n      return ctx.stylize(Date.prototype.toString.call(value), 'date');\n    }\n    if (isError(value)) {\n      return formatError(value);\n    }\n  }\n\n  var base = '', array = false, braces = ['{', '}'];\n\n  // Make Array say that they are Array\n  if (isArray(value)) {\n    array = true;\n    braces = ['[', ']'];\n  }\n\n  // Make functions say that they are functions\n  if (isFunction(value)) {\n    var n = value.name ? ': ' + value.name : '';\n    base = ' [Function' + n + ']';\n  }\n\n  // Make RegExps say that they are RegExps\n  if (isRegExp(value)) {\n    base = ' ' + RegExp.prototype.toString.call(value);\n  }\n\n  // Make dates with properties first say the date\n  if (isDate(value)) {\n    base = ' ' + Date.prototype.toUTCString.call(value);\n  }\n\n  // Make error with message first say the error\n  if (isError(value)) {\n    base = ' ' + formatError(value);\n  }\n\n  if (keys.length === 0 && (!array || value.length == 0)) {\n    return braces[0] + base + braces[1];\n  }\n\n  if (recurseTimes < 0) {\n    if (isRegExp(value)) {\n      return ctx.stylize(RegExp.prototype.toString.call(value), 'regexp');\n    } else {\n      return ctx.stylize('[Object]', 'special');\n    }\n  }\n\n  ctx.seen.push(value);\n\n  var output;\n  if (array) {\n    output = formatArray(ctx, value, recurseTimes, visibleKeys, keys);\n  } else {\n    output = keys.map(function(key) {\n      return formatProperty(ctx, value, recurseTimes, visibleKeys, key, array);\n    });\n  }\n\n  ctx.seen.pop();\n\n  return reduceToSingleString(output, base, braces);\n}\n\n\nfunction formatPrimitive(ctx, value) {\n  if (isUndefined(value))\n    return ctx.stylize('undefined', 'undefined');\n  if (isString(value)) {\n    var simple = '\\'' + JSON.stringify(value).replace(/^\"|\"$/g, '')\n                                             .replace(/'/g, \"\\\\'\")\n                                             .replace(/\\\\\"/g, '\"') + '\\'';\n    return ctx.stylize(simple, 'string');\n  }\n  if (isNumber(value))\n    return ctx.stylize('' + value, 'number');\n  if (isBoolean(value))\n    return ctx.stylize('' + value, 'boolean');\n  // For some reason typeof null is \"object\", so special case here.\n  if (isNull(value))\n    return ctx.stylize('null', 'null');\n}\n\n\nfunction formatError(value) {\n  return '[' + Error.prototype.toString.call(value) + ']';\n}\n\n\nfunction formatArray(ctx, value, recurseTimes, visibleKeys, keys) {\n  var output = [];\n  for (var i = 0, l = value.length; i < l; ++i) {\n    if (hasOwnProperty(value, String(i))) {\n      output.push(formatProperty(ctx, value, recurseTimes, visibleKeys,\n          String(i), true));\n    } else {\n      output.push('');\n    }\n  }\n  keys.forEach(function(key) {\n    if (!key.match(/^\\d+$/)) {\n      output.push(formatProperty(ctx, value, recurseTimes, visibleKeys,\n          key, true));\n    }\n  });\n  return output;\n}\n\n\nfunction formatProperty(ctx, value, recurseTimes, visibleKeys, key, array) {\n  var name, str, desc;\n  desc = Object.getOwnPropertyDescriptor(value, key) || { value: value[key] };\n  if (desc.get) {\n    if (desc.set) {\n      str = ctx.stylize('[Getter/Setter]', 'special');\n    } else {\n      str = ctx.stylize('[Getter]', 'special');\n    }\n  } else {\n    if (desc.set) {\n      str = ctx.stylize('[Setter]', 'special');\n    }\n  }\n  if (!hasOwnProperty(visibleKeys, key)) {\n    name = '[' + key + ']';\n  }\n  if (!str) {\n    if (ctx.seen.indexOf(desc.value) < 0) {\n      if (isNull(recurseTimes)) {\n        str = formatValue(ctx, desc.value, null);\n      } else {\n        str = formatValue(ctx, desc.value, recurseTimes - 1);\n      }\n      if (str.indexOf('\\n') > -1) {\n        if (array) {\n          str = str.split('\\n').map(function(line) {\n            return '  ' + line;\n          }).join('\\n').substr(2);\n        } else {\n          str = '\\n' + str.split('\\n').map(function(line) {\n            return '   ' + line;\n          }).join('\\n');\n        }\n      }\n    } else {\n      str = ctx.stylize('[Circular]', 'special');\n    }\n  }\n  if (isUndefined(name)) {\n    if (array && key.match(/^\\d+$/)) {\n      return str;\n    }\n    name = JSON.stringify('' + key);\n    if (name.match(/^\"([a-zA-Z_][a-zA-Z_0-9]*)\"$/)) {\n      name = name.substr(1, name.length - 2);\n      name = ctx.stylize(name, 'name');\n    } else {\n      name = name.replace(/'/g, \"\\\\'\")\n                 .replace(/\\\\\"/g, '\"')\n                 .replace(/(^\"|\"$)/g, \"'\");\n      name = ctx.stylize(name, 'string');\n    }\n  }\n\n  return name + ': ' + str;\n}\n\n\nfunction reduceToSingleString(output, base, braces) {\n  var numLinesEst = 0;\n  var length = output.reduce(function(prev, cur) {\n    numLinesEst++;\n    if (cur.indexOf('\\n') >= 0) numLinesEst++;\n    return prev + cur.replace(/\\u001b\\[\\d\\d?m/g, '').length + 1;\n  }, 0);\n\n  if (length > 60) {\n    return braces[0] +\n           (base === '' ? '' : base + '\\n ') +\n           ' ' +\n           output.join(',\\n  ') +\n           ' ' +\n           braces[1];\n  }\n\n  return braces[0] + base + ' ' + output.join(', ') + ' ' + braces[1];\n}\n\n\n// NOTE: These type checking functions intentionally don't use `instanceof`\n// because it is fragile and can be easily faked with `Object.create()`.\nfunction isArray(ar) {\n  return Array.isArray(ar);\n}\nexports.isArray = isArray;\n\nfunction isBoolean(arg) {\n  return typeof arg === 'boolean';\n}\nexports.isBoolean = isBoolean;\n\nfunction isNull(arg) {\n  return arg === null;\n}\nexports.isNull = isNull;\n\nfunction isNullOrUndefined(arg) {\n  return arg == null;\n}\nexports.isNullOrUndefined = isNullOrUndefined;\n\nfunction isNumber(arg) {\n  return typeof arg === 'number';\n}\nexports.isNumber = isNumber;\n\nfunction isString(arg) {\n  return typeof arg === 'string';\n}\nexports.isString = isString;\n\nfunction isSymbol(arg) {\n  return typeof arg === 'symbol';\n}\nexports.isSymbol = isSymbol;\n\nfunction isUndefined(arg) {\n  return arg === void 0;\n}\nexports.isUndefined = isUndefined;\n\nfunction isRegExp(re) {\n  return isObject(re) && objectToString(re) === '[object RegExp]';\n}\nexports.isRegExp = isRegExp;\n\nfunction isObject(arg) {\n  return typeof arg === 'object' && arg !== null;\n}\nexports.isObject = isObject;\n\nfunction isDate(d) {\n  return isObject(d) && objectToString(d) === '[object Date]';\n}\nexports.isDate = isDate;\n\nfunction isError(e) {\n  return isObject(e) &&\n      (objectToString(e) === '[object Error]' || e instanceof Error);\n}\nexports.isError = isError;\n\nfunction isFunction(arg) {\n  return typeof arg === 'function';\n}\nexports.isFunction = isFunction;\n\nfunction isPrimitive(arg) {\n  return arg === null ||\n         typeof arg === 'boolean' ||\n         typeof arg === 'number' ||\n         typeof arg === 'string' ||\n         typeof arg === 'symbol' ||  // ES6 symbol\n         typeof arg === 'undefined';\n}\nexports.isPrimitive = isPrimitive;\n\nexports.isBuffer = __webpack_require__(/*! ./support/isBuffer */ \"./node_modules/util/support/isBufferBrowser.js\");\n\nfunction objectToString(o) {\n  return Object.prototype.toString.call(o);\n}\n\n\nfunction pad(n) {\n  return n < 10 ? '0' + n.toString(10) : n.toString(10);\n}\n\n\nvar months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep',\n              'Oct', 'Nov', 'Dec'];\n\n// 26 Feb 16:19:34\nfunction timestamp() {\n  var d = new Date();\n  var time = [pad(d.getHours()),\n              pad(d.getMinutes()),\n              pad(d.getSeconds())].join(':');\n  return [d.getDate(), months[d.getMonth()], time].join(' ');\n}\n\n\n// log is just a thin wrapper to console.log that prepends a timestamp\nexports.log = function() {\n  console.log('%s - %s', timestamp(), exports.format.apply(exports, arguments));\n};\n\n\n/**\n * Inherit the prototype methods from one constructor into another.\n *\n * The Function.prototype.inherits from lang.js rewritten as a standalone\n * function (not on Function.prototype). NOTE: If this file is to be loaded\n * during bootstrapping this function needs to be rewritten using some native\n * functions as prototype setup using normal JavaScript does not work as\n * expected during bootstrapping (see mirror.js in r114903).\n *\n * @param {function} ctor Constructor function which needs to inherit the\n *     prototype.\n * @param {function} superCtor Constructor function to inherit prototype from.\n */\nexports.inherits = __webpack_require__(/*! inherits */ \"./node_modules/inherits/inherits_browser.js\");\n\nexports._extend = function(origin, add) {\n  // Don't do anything if add isn't an object\n  if (!add || !isObject(add)) return origin;\n\n  var keys = Object.keys(add);\n  var i = keys.length;\n  while (i--) {\n    origin[keys[i]] = add[keys[i]];\n  }\n  return origin;\n};\n\nfunction hasOwnProperty(obj, prop) {\n  return Object.prototype.hasOwnProperty.call(obj, prop);\n}\n\nvar kCustomPromisifiedSymbol = typeof Symbol !== 'undefined' ? Symbol('util.promisify.custom') : undefined;\n\nexports.promisify = function promisify(original) {\n  if (typeof original !== 'function')\n    throw new TypeError('The \"original\" argument must be of type Function');\n\n  if (kCustomPromisifiedSymbol && original[kCustomPromisifiedSymbol]) {\n    var fn = original[kCustomPromisifiedSymbol];\n    if (typeof fn !== 'function') {\n      throw new TypeError('The \"util.promisify.custom\" argument must be of type Function');\n    }\n    Object.defineProperty(fn, kCustomPromisifiedSymbol, {\n      value: fn, enumerable: false, writable: false, configurable: true\n    });\n    return fn;\n  }\n\n  function fn() {\n    var promiseResolve, promiseReject;\n    var promise = new Promise(function (resolve, reject) {\n      promiseResolve = resolve;\n      promiseReject = reject;\n    });\n\n    var args = [];\n    for (var i = 0; i < arguments.length; i++) {\n      args.push(arguments[i]);\n    }\n    args.push(function (err, value) {\n      if (err) {\n        promiseReject(err);\n      } else {\n        promiseResolve(value);\n      }\n    });\n\n    try {\n      original.apply(this, args);\n    } catch (err) {\n      promiseReject(err);\n    }\n\n    return promise;\n  }\n\n  Object.setPrototypeOf(fn, Object.getPrototypeOf(original));\n\n  if (kCustomPromisifiedSymbol) Object.defineProperty(fn, kCustomPromisifiedSymbol, {\n    value: fn, enumerable: false, writable: false, configurable: true\n  });\n  return Object.defineProperties(\n    fn,\n    getOwnPropertyDescriptors(original)\n  );\n}\n\nexports.promisify.custom = kCustomPromisifiedSymbol\n\nfunction callbackifyOnRejected(reason, cb) {\n  // `!reason` guard inspired by bluebird (Ref: https://goo.gl/t5IS6M).\n  // Because `null` is a special error value in callbacks which means \"no error\n  // occurred\", we error-wrap so the callback consumer can distinguish between\n  // \"the promise rejected with null\" or \"the promise fulfilled with undefined\".\n  if (!reason) {\n    var newReason = new Error('Promise was rejected with a falsy value');\n    newReason.reason = reason;\n    reason = newReason;\n  }\n  return cb(reason);\n}\n\nfunction callbackify(original) {\n  if (typeof original !== 'function') {\n    throw new TypeError('The \"original\" argument must be of type Function');\n  }\n\n  // We DO NOT return the promise as it gives the user a false sense that\n  // the promise is actually somehow related to the callback's execution\n  // and that the callback throwing will reject the promise.\n  function callbackified() {\n    var args = [];\n    for (var i = 0; i < arguments.length; i++) {\n      args.push(arguments[i]);\n    }\n\n    var maybeCb = args.pop();\n    if (typeof maybeCb !== 'function') {\n      throw new TypeError('The last argument must be of type Function');\n    }\n    var self = this;\n    var cb = function() {\n      return maybeCb.apply(self, arguments);\n    };\n    // In true node style we process the callback on `nextTick` with all the\n    // implications (stack, `uncaughtException`, `async_hooks`)\n    original.apply(this, args)\n      .then(function(ret) { process.nextTick(cb, null, ret) },\n            function(rej) { process.nextTick(callbackifyOnRejected, rej, cb) });\n  }\n\n  Object.setPrototypeOf(callbackified, Object.getPrototypeOf(original));\n  Object.defineProperties(callbackified,\n                          getOwnPropertyDescriptors(original));\n  return callbackified;\n}\nexports.callbackify = callbackify;\n\n/* WEBPACK VAR INJECTION */}.call(this, __webpack_require__(/*! ./../process/browser.js */ \"./node_modules/process/browser.js\")))\n\n//# sourceURL=webpack:///./node_modules/util/util.js?")
                    }, "./node_modules/webpack/buildin/global.js": function (module, exports) {
                        eval('var g;\n\n// This works in non-strict mode\ng = (function() {\n\treturn this;\n})();\n\ntry {\n\t// This works if eval is allowed (see CSP)\n\tg = g || new Function("return this")();\n} catch (e) {\n\t// This works if the window reference is available\n\tif (typeof window === "object") g = window;\n}\n\n// g can still be undefined, but nothing to do about it...\n// We return undefined, instead of nothing here, so it\'s\n// easier to handle this case. if(!global) { ...}\n\nmodule.exports = g;\n\n\n//# sourceURL=webpack:///(webpack)/buildin/global.js?')
                    }, "./src/index.js": function (module, __webpack_exports__, __webpack_require__) {
                        "use strict";
                        eval('__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PasswordSheriff", function() { return PasswordSheriff; });\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PasswordPolicy", function() { return PasswordPolicy; });\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "charsets", function() { return charsets; });\n\nvar charsets = __webpack_require__(/*! ./lib/rules/contains */ "./src/lib/rules/contains.js").charsets;\n\nvar upperCase         = charsets.upperCase;\nvar lowerCase         = charsets.lowerCase;\nvar numbers           = charsets.numbers;\nvar specialCharacters = charsets.specialCharacters;\n\nvar PasswordPolicy = __webpack_require__(/*! ./lib/policy */ "./src/lib/policy.js");\n\nvar none =  new PasswordPolicy({\n  length: { minLength: 1 }\n});\n\nvar low = new PasswordPolicy({\n  length: { minLength: 6 }\n});\n\nvar fair = new PasswordPolicy({\n  length: { minLength: 8 },\n  contains: {\n    expressions: [lowerCase, upperCase, numbers]\n  }\n});\n\nvar good = new PasswordPolicy({\n  length: { minLength: 8 },\n  containsAtLeast: {\n    atLeast: 3,\n    expressions: [lowerCase, upperCase, numbers, specialCharacters]\n  }\n});\n\nvar excellent = new PasswordPolicy({\n  length: { minLength: 10 },\n  containsAtLeast: {\n    atLeast: 3,\n    expressions: [lowerCase, upperCase, numbers, specialCharacters]\n  },\n  identicalChars: { max: 2 }\n});\n\nvar policiesByName = {\n  none:       none,\n  low:        low,\n  fair:       fair,\n  good:       good,\n  excellent:  excellent\n};\n\n/**\n * Creates a password policy.\n *\n * @param {String} policyName Name of policy to use.\n */\n\nfunction PasswordSheriff(policyName) {\n  var policy = policiesByName[policyName] || policiesByName.none;\n\n  return {\n    /**\n     * Checks that a password meets this policy\n     *\n     * @method check\n     * @param {String} password\n     */\n    check: function (password) {\n      return policy.check(password);\n    },\n    /**\n     * @method assert\n     * Asserts that a passord meets this policy else throws an exception.\n     *\n     * @param {String} password\n     */\n    assert: function (password) {\n      return policy.assert(password);\n    },\n\n    missing: function (password) {\n      return policy.missing(password);\n    },\n\n    missingAsMarkdown: function (password) {\n      return policy.missingAsMarkdown(password);\n    },\n\n    explain: function () {\n      return policy.explain();\n    },\n\n    /**\n     * Friendly string representation of the policy\n     * @method toString\n     */\n    toString: function () {\n      return policy.toString();\n    }\n  };\n};\n\n\n\n\n// module.exports = PasswordSheriff;\n// module.exports.PasswordPolicy = PasswordPolicy;\n// module.exports.charsets = charsets;\n\n// module.exports.rulesToApply = rulesToApply;\n\n\n//# sourceURL=webpack:///./src/index.js?')
                    }, "./src/lib/helper.js": function (module, exports, __webpack_require__) {
                        eval("/* WEBPACK VAR INJECTION */(function(global) {var _ = {};\nvar root = typeof self == 'object' && self.self === self && self ||\n            typeof global == 'object' && global.global === global && global ||\n            this ||\n            {};\nvar nativeIsArray = Array.isArray;\nvar nativeKeys = Object.keys;\nvar ObjProto = Object.prototype;\nvar toString = ObjProto.toString;\n\nvar shallowProperty = function(key) {\n  return function(obj) {\n    return obj == null ? void 0 : obj[key];\n  };\n};\n\nvar MAX_ARRAY_INDEX = Math.pow(2, 53) - 1;\nvar getLength = shallowProperty('length');\nvar isArrayLike = function(collection) {\n  var length = getLength(collection);\n  return typeof length == 'number' && length >= 0 && length <= MAX_ARRAY_INDEX;\n};\n\n// Add some isType methods: isArguments, isFunction, isString, isNumber, isDate, isRegExp, isError, isMap, isWeakMap, isSet, isWeakSet.\nvar typeNames = ['Arguments', 'Function', 'String', 'Number'];\nfunction loopAsign(name) {\n  _['is' + name] = function(obj) {\n    return toString.call(obj) === '[object ' + name + ']';\n  };\n}\nfor (var a = 0; a < typeNames.length; a++) {\n  loopAsign(typeNames[a]);\n}\n\nvar nodelist = root.document && root.document.childNodes;\nif ( true && typeof Int8Array != 'object' && typeof nodelist != 'function') {\n  _.isFunction = function(obj) {\n    return typeof obj == 'function' || false;\n  };\n}\n\n_.identity = function(value) {\n  return value;\n};\n\n_.keys = function(obj) {\n  if (!_.isObject(obj)) return [];\n  if (nativeKeys) return nativeKeys(obj);\n  var keys = [];\n  for (var key in obj) keys.push(key);\n  return keys;\n};\n\n_.isObject = function(obj) {\n  var type = typeof obj;\n  return type === 'function' || type === 'object' && !!obj;\n};\n\n_.isArray = nativeIsArray || function(obj) {\n  return toString.call(obj) === '[object Array]';\n};\n\n_.isEmpty = function(obj) {\n  if (obj == null) return true;\n  if (isArrayLike(obj) && (_.isArray(obj) || _.isString(obj) || _.isArguments(obj))) return obj.length === 0;\n  return _.keys(obj).length === 0;\n};\n\n_.isNaN = function(obj) {\n  return _.isNumber(obj) && isNaN(obj);\n};\n\nmodule.exports = _;\n/* WEBPACK VAR INJECTION */}.call(this, __webpack_require__(/*! ./../../node_modules/webpack/buildin/global.js */ \"./node_modules/webpack/buildin/global.js\")))\n\n//# sourceURL=webpack:///./src/lib/helper.js?")
                    }, "./src/lib/policy.js": function (module, exports, __webpack_require__) {
                        eval("var format = __webpack_require__(/*! util */ \"./node_modules/util/util.js\").format;\n\nvar PasswordPolicyError = __webpack_require__(/*! ./policy_error */ \"./src/lib/policy_error.js\");\n\nfunction isString(value) {\n  return typeof value === 'string' || value instanceof String;\n}\n\nvar defaultRuleset = {\n  length:           __webpack_require__(/*! ./rules/length */ \"./src/lib/rules/length.js\"),\n  contains:         __webpack_require__(/*! ./rules/contains */ \"./src/lib/rules/contains.js\"),\n  containsAtLeast:  __webpack_require__(/*! ./rules/containsAtLeast */ \"./src/lib/rules/containsAtLeast.js\"),\n  identicalChars:   __webpack_require__(/*! ./rules/identicalChars */ \"./src/lib/rules/identicalChars.js\"),\n};\n\nfunction flatDescriptions (descriptions, index) {\n  if (!descriptions.length) {\n    return '';\n  }\n\n  function flatSingleDescription (description, index) {\n    var spaces = (new Array(index+1)).join(' ');\n    var result = spaces + '* ';\n    if (description.format) {\n      result += format.apply(null, [description.message].concat(description.format));\n    } else {\n      result += description.message;\n    }\n\n    if (description.items) {\n      result += '\\n' + spaces + flatDescriptions(description.items, index + 1);\n    }\n    return result;\n  }\n\n  var firstDescription = flatSingleDescription(descriptions[0], index);\n\n  descriptions = descriptions.slice(1).reduce(function (result, description) {\n    result += '\\n' + flatSingleDescription(description, index);\n\n    return result;\n  }, firstDescription);\n\n  return descriptions;\n}\n\n/**\n * Creates a PasswordPolicy which is a set of rules.\n *\n * @class PasswordPolicy\n * @constructor\n */\nfunction PasswordPolicy(rules, ruleset) {\n  this.rules = rules;\n  this.ruleset = ruleset || defaultRuleset;\n\n  this._reduce(function (result, ruleOptions, rule) {\n    rule.validate(ruleOptions);\n  });\n}\n\nPasswordPolicy.prototype = {};\n\nPasswordPolicy.prototype._reduce = function (fn, value) {\n  var self = this;\n  return Object.keys(this.rules).reduce(function (result, ruleName) {\n    var ruleOptions = self.rules[ruleName];\n    var rule = self.ruleset[ruleName];\n\n    return fn(result, ruleOptions, rule);\n\n  }, value);\n};\n\nPasswordPolicy.prototype._applyRules = function (password) {\n  return this._reduce(function (result, ruleOptions, rule) {\n    // If previous result was false as this an &&, then nothing to do here!\n    if (!result) {\n      return false;\n    }\n\n    if (!rule) {\n      return false;\n    }\n\n    return rule.assert(ruleOptions, password);\n  }, true);\n};\n\nPasswordPolicy.prototype.missing = function (password) {\n  return this._reduce(function (result, ruleOptions, rule) {\n    var missingRule = rule.missing(ruleOptions, password);\n    result.rules.push(missingRule);\n    result.verified = result.verified && !!missingRule.verified;\n    return result;\n  }, {rules: [], verified: true});\n};\n\nPasswordPolicy.prototype.explain = function () {\n  return this._reduce(function (result, ruleOptions, rule) {\n    result.push(rule.explain(ruleOptions));\n    return result;\n  }, []);\n};\n\nPasswordPolicy.prototype.missingAsMarkdown = function (password) {\n  return flatDescriptions(this.missing(password), 1);\n};\n\nPasswordPolicy.prototype.toString = function () {\n  var descriptions = this.explain();\n  return flatDescriptions(descriptions, 0);\n};\n\nPasswordPolicy.prototype.check = function (password) {\n  if (!isString(password)) {\n    return false;\n  }\n\n  return this._applyRules(password);\n};\n\nPasswordPolicy.prototype.assert = function (password) {\n  if (!this.check(password)) {\n    throw new PasswordPolicyError('Password does not meet password policy');\n  }\n};\n\nmodule.exports = PasswordPolicy;\n\n\n//# sourceURL=webpack:///./src/lib/policy.js?")
                    }, "./src/lib/policy_error.js": function (module, exports) {
                        eval("/**\n * Error thrown when asserting a policy against a password.\n *\n * @class PasswordPolicyError\n * @constructor\n *\n * @param {String} msg Descriptive message of the error\n */\nfunction PasswordPolicyError(msg) {\n  var err = Error.call(this, msg);\n  err.name = 'PasswordPolicyError';\n  return err;\n}\n\nmodule.exports = PasswordPolicyError;\n\n\n//# sourceURL=webpack:///./src/lib/policy_error.js?")
                    }, "./src/lib/rules/contains.js": function (module, exports, __webpack_require__) {
                        eval("var _ = __webpack_require__(/*! ../helper */ \"./src/lib/helper.js\");\n\n/* OWASP Special Characters: https://www.owasp.org/index.php/Password_special_characters */\nvar specialCharacters = [' ', '!', '\"', '#', '\\\\$', '%', '&', '\\'', '\\\\(', '\\\\)', '\\\\*', '\\\\+', ',', '-', '\\\\.', '/', ':', ';', '<', '=', '>', '\\\\?', '@', '\\\\[', '\\\\\\\\', '\\\\]', '\\\\^', '_','`','{','\\\\|', '}','~'].join('|');\n\nvar specialCharactersRegexp = new RegExp(specialCharacters);\n\nmodule.exports = {\n  validate: function (options) {\n    if (!_.isObject(options)) {\n      throw new Error('options should be an object');\n    }\n\n    if (!_.isArray(options.expressions) || _.isEmpty(options.expressions)) {\n      throw new Error('contains expects expressions to be a non-empty array');\n    }\n\n    var ok = options.expressions.every(function (expression) {\n      return _.isFunction(expression.explain) && _.isFunction(expression.test);\n    });\n\n    if (!ok) {\n      throw new Error('contains expressions are invalid: An explain and a test function should be provided');\n    }\n    return true;\n  },\n  explain: function (options) {\n    return {\n      message: 'Should contain:',\n      code: 'shouldContain',\n      items: options.expressions.map(function (expression) {\n        return expression.explain();\n      })\n    };\n  },\n  missing: function (options, password) {\n    var expressions = options.expressions.map(function (expression) {\n      var explained = expression.explain();\n      explained.verified = expression.test(password);\n      return explained;\n    });\n\n    var verified = expressions.every(function (expression) {\n      return expression.verified;\n    });\n\n    return {\n      message: 'Should contain:',\n      code: 'shouldContain',\n      verified: verified,\n      items: expressions\n    };\n  },\n  assert: function (options, password) {\n    if (!password) {\n      return false;\n    }\n\n    return options.expressions.every(function (expression) {\n      var result = expression.test(password);\n      return result;\n    });\n  },\n  charsets: {\n    upperCase: {\n      explain: function () { return {\n        message: 'upper case letters (A-Z)',\n        code: 'upperCase'\n      }; },\n      test: function (password) { return /[A-Z]/.test(password); }\n    },\n    lowerCase: {\n      explain: function () { return {\n        message: 'lower case letters (a-z)',\n        code: 'lowerCase'\n      }; },\n      test: function (password) { return /[a-z]/.test(password); }\n    },\n    specialCharacters: {\n      explain: function () { return {\n        message: 'special characters (e.g. !@#$%^&*)',\n        code: 'specialCharacters'\n      }; },\n      test: function (password) { return specialCharactersRegexp.test(password); }\n    },\n    numbers: {\n      explain: function () { return {\n        message: 'numbers (i.e. 0-9)',\n        code: 'numbers'\n      }; },\n      test: function (password) { return /\\d/.test(password); }\n    }\n  }\n};\n\n\n//# sourceURL=webpack:///./src/lib/rules/contains.js?")
                    }, "./src/lib/rules/containsAtLeast.js": function (module, exports, __webpack_require__) {
                        eval("var _ = __webpack_require__(/*! ../helper */ \"./src/lib/helper.js\");\n\nvar contains = __webpack_require__(/*! ./contains */ \"./src/lib/rules/contains.js\");\n\nfunction createIntroMessage() {\n  return 'Contain at least %d of the following %d types of characters:';\n}\n\nmodule.exports = {\n  // TODO validate atLeast to be a number > 0 and expressions to be a list of at least 1\n  validate: function (options) {\n    if (!_.isObject(options)) {\n      throw new Error('options should be an object');\n    }\n\n    if (!_.isNumber(options.atLeast) || _.isNaN(options.atLeast) || options.atLeast < 1) {\n      throw new Error('atLeast should be a valid, non-NaN number, greater than 0');\n    }\n\n    if (!_.isArray(options.expressions) || _.isEmpty(options.expressions)) {\n      throw new Error('expressions should be an non-empty array');\n    }\n\n    if (options.expressions.length < options.atLeast) {\n      throw new Error('expressions length should be greater than atLeast');\n    }\n\n    var ok = options.expressions.every(function (expression) {\n      return _.isFunction(expression.explain) && _.isFunction(expression.test);\n    });\n\n    if (!ok) {\n      throw new Error('containsAtLeast expressions are invalid: An explain and a test function should be provided');\n    }\n\n    return true;\n  },\n  explain: function (options) {\n    return {\n      message: createIntroMessage(),\n      code: 'containsAtLeast',\n      format: [options.atLeast, options.expressions.length],\n      items: options.expressions.map(function (x) { return x.explain(); })\n    };\n  },\n  missing: function (options, password) {\n    var expressions = options.expressions && options.expressions.map(function (expression) {\n      var explained = expression.explain();\n      explained.verified = expression.test(password);\n      return explained;\n    });\n\n    var verifiedCount = expressions.reduce(function (val, ex) { return val + !!ex.verified; }, 0);\n    var verified = verifiedCount >= options.atLeast;\n\n    return {\n      message: createIntroMessage(),\n      code: 'containsAtLeast',\n      format: [options.atLeast, options.expressions.length],\n      items: expressions,\n      verified: verified\n    };\n  },\n  assert: function (options, password) {\n    if (!password) {\n      return false;\n    }\n\n    var workingExpressions = options.expressions.filter(function (expression) {\n      return expression.test(password);\n    });\n\n    return workingExpressions.length >= options.atLeast;\n  },\n  charsets: contains.charsets\n};\n\n\n//# sourceURL=webpack:///./src/lib/rules/containsAtLeast.js?")
                    }, "./src/lib/rules/identicalChars.js": function (module, exports, __webpack_require__) {
                        eval("var _ = __webpack_require__(/*! ../helper */ \"./src/lib/helper.js\");\n\nfunction assert(options, password) {\n  if (!password) {\n    return false;\n  }\n\n  var i, current = {c: null, count: 0};\n\n  for (i = 0; i < password.length; i++) {\n    if (current.c !== password[i]) {\n      current.c = password[i];\n      current.count = 1;\n    } else {\n      current.count++;\n    }\n\n    if (current.count > options.max) {\n      return false;\n    }\n  }\n\n  return true;\n}\nfunction explain (options, verified) {\n    var example = (new Array(options.max+2)).join('a');\n    var d = {\n      message: 'No more than %d identical characters in a row (e.g., \"%s\" not allowed)',\n      code: 'identicalChars',\n      format: [options.max, example]\n    };\n    if (verified !== undefined) {\n      d.verified = verified;\n    }\n    return d;\n  }\n\nmodule.exports = {\n  validate: function (options) {\n    if (!_.isObject(options)) {\n      throw new Error('options should be an object');\n    }\n\n    if (!_.isNumber(options.max) || _.isNaN(options.max) || options.max < 1 ) {\n      throw new Error('max should be a number greater than 1');\n    }\n\n    return true;\n  },\n  explain: explain,\n  missing: function (options, password) {\n    return explain(options, assert(options, password));\n  },\n  assert: assert\n};\n\n\n//# sourceURL=webpack:///./src/lib/rules/identicalChars.js?")
                    }, "./src/lib/rules/length.js": function (module, exports, __webpack_require__) {
                        eval("var _ = __webpack_require__(/*! ../helper */ \"./src/lib/helper.js\");\n\n/* A rule should contain explain and rule methods */\n// TODO explain explain\n// TODO explain missing\n// TODO explain assert\n\nfunction assert (options, password) {\n  return !!password && options.minLength <= password.length;\n}\n\nfunction explain(options) {\n  if (options.minLength === 1) {\n    return {\n      message: 'Non-empty password required',\n      code: 'nonEmpty'\n    };\n  }\n\n  return {\n    message: 'At least %d characters in length',\n    format: [options.minLength],\n    code: 'lengthAtLeast'\n  };\n}\n\nmodule.exports = {\n  validate: function (options) {\n    if (!_.isObject(options)) {\n      throw new Error('options should be an object');\n    }\n\n    if (!_.isNumber(options.minLength) || _.isNaN(options.minLength)) {\n      throw new Error('length expects minLength to be a non-zero number');\n    }\n\n    return true;\n  },\n  explain: explain,\n  missing: function (options, password) {\n    var explained = explain(options);\n    explained.verified = !!assert(options, password);\n    return explained;\n  },\n  assert: assert\n};\n\n\n//# sourceURL=webpack:///./src/lib/rules/length.js?")
                    }
                })
            }
        };
        return module.exports
    }

    function showHidePassword() {
        var n = {};
        return n.exports = function (r, n, i, a, u, c, l) {
            n("div.ca3fd6148.password").forEach(function (n) {
                var s, o, e = r(n, "input"), t = r(n, '[data-action="toggle"]');
                i(n, (s = e, o = t, function (n) {
                    if (n.target.classList.contains("ulp-button-icon")) {
                        if (s.type = "password" === s.type ? "text" : "password", o) {
                            var e = o.querySelector(".show-password-tooltip"),
                                t = o.querySelector(".hide-password-tooltip");
                            e && c(e, "hide"), t && c(t, "hide")
                        }
                        var r = l(s);
                        "text" === s.type ? a(r, "show") : u(r, "show")
                    }
                }))
            })
        }, n.exports
    }

    function passwordPolicies() {
        var n = {};
        return n.exports = function (n, a, e, t, r, u, c, s, o, i, l) {
            var p, f, d, m, h, g, b, y, v, w, x = n(), _ = x.PasswordPolicy,
                j = (p = x.charsets, f = a, d = p.upperCase, m = p.lowerCase, h = p.numbers, g = p.specialCharacters, b = {
                    none: {length: {minLength: 1}},
                    low: {length: {minLength: 6}},
                    fair: {length: {minLength: 8}, contains: {expressions: [m, d, h]}},
                    good: {length: {minLength: 8}, containsAtLeast: {atLeast: 3, expressions: [m, d, h, g]}},
                    excellent: {
                        length: {minLength: 10},
                        containsAtLeast: {atLeast: 3, expressions: [m, d, h, g]},
                        identicalChars: {max: 2}
                    }
                }, y = f('input[name="complexityOptions.minLength"][type="hidden"]').value, v = {
                    complexityOptions: {minLength: y && parseInt(y)},
                    strengthPolicy: f('input[name="strengthPolicy"][type="hidden"]').value || "none"
                }, !!(w = b[v.strengthPolicy]) && (v.complexityOptions && v.complexityOptions.minLength && !isNaN(v.complexityOptions.minLength) && (w.length.minLength = v.complexityOptions.minLength), w)),
                k = new _(j);
            if (j) {
                var T = a("form.c078920ea"), E = e('input[type="password"]'), O = e("div.ca3fd6148.password"),
                    S = E[0] || !1, P = a(".c317d0b1c.c9fd04e00");
                a("li.c2817e76f"), a("div.ca0060b47"), S && T && P && (s(S, "input", C), s(S, "keyup", A), s(T, "submit", function (n) {
                    var e = o("submitted");
                    i("submitted", !0), N();
                    var t, r, s = A();
                    if (r = (t = {
                        event: n,
                        passwordIsValid: s
                    }).event, !t.passwordIsValid && (r.stopPropagation(), r.preventDefault(), S.focus(), 1)) return i("submitted", !1), C(), E.forEach(function (n) {
                        c(n, "c8efe4674")
                    }), void O.forEach(function (n) {
                        c(n, "c5c6e62c0")
                    });
                    e && l(n)
                }))
            } else console.error("ERROR: Couldn't find a matching password policy, disabling password policy validation.");

            function C(n) {
                t(P, "data-shown") || (u(P, "hide"), c(P, "cd481f532"), r(P, "data-shown", !0))
            }

            function A(n) {
                var e = S.value, t = k.missing(e);
                return function n(e) {
                    if (e) for (var t = 0; t < e.length; t++) {
                        var r = e[t],
                            s = '.c317d0b1c ul li[data-error-code="password-policy-' + r.code.split(/([A-Z])/).map(function (n) {
                                return n.toLowerCase()
                            }).map(function (n, e) {
                                return e % 2 == 1 ? "-" + n : n
                            }).join("") + '"]', o = a(s);
                        if (o) {
                            u(o, "c5c6e62c0"), u(o, "c6be0b796");
                            var i = r.verified ? "c6be0b796" : "c5c6e62c0";
                            c(o, i)
                        }
                        r.items && n(r.items)
                    }
                }(t.rules), t.verified && N(), t.verified
            }

            function N() {
                E.forEach(function (n) {
                    u(n, "c8efe4674")
                }), O.forEach(function (n) {
                    u(n, "c5c6e62c0")
                })
            }
        }, n.exports
    }

    function inputFocus() {
        var n = {};
        return n.exports = function (r, n, s, o, i, a, u, c, t, l) {
            function p(n) {
                var e = n.target, t = a(e);
                e.value || l(e, "data-autofilled") ? o(t, "c4457bd38") : i(t, "c4457bd38")
            }

            function f(n) {
                var e = n.target;
                "onAutoFillStart" === n.animationName && (t(e, "data-autofilled", !0), c(n.target, "change", !0), s(e, "keyup", d, {once: !0}))
            }

            function d(n) {
                var e = n.target;
                t(e, "data-autofilled", "")
            }

            if (r("body._simple-labels")) return n(".ca52889fd.no-js").forEach(function (n) {
                i(n, "no-js")
            }), void n(".ca52889fd.js-required").forEach(function (n) {
                o(n, "hide")
            });
            n(".ca3fd6148:not(.c772fafaf):not(disabled)").forEach(function (n) {
                o(n, "c22285f6b");
                var e, t = r(n, ".input");
                t.value && o(n, "c4457bd38"), s(n, "change", p), s(t, "blur", p), s(t, "animationstart", f), e = t, u(function () {
                    e.value && c(e, "change", !0)
                }, 100)
            })
        }, n.exports
    }

    function loadCaptcha() {
        var n = {}, p = "recaptcha_v2", f = "recaptcha_enterprise", d = "hcaptcha", m = "friendly_captcha";
        return n.exports = function (t, n, r, s) {
            var o = n("div[data-captcha-sitekey]"), e = n("div[data-captcha-sitekey] input");

            function i() {
                return n(function () {
                    switch (u()) {
                        case p:
                        case f:
                            return "#ulp-recaptcha";
                        case d:
                            return "#ulp-hcaptcha";
                        case m:
                            return "#ulp-friendly-captcha"
                    }
                }())
            }

            function a() {
                return o.getAttribute("data-captcha-lang")
            }

            function u() {
                return o.getAttribute("data-captcha-provider")
            }

            function c() {
                return o.getAttribute("data-captcha-sitekey")
            }

            function l(n) {
                return e.value = n
            }

            o && function () {
                var n = "captchaCallback_" + Math.floor(1000001 * Math.random());
                window[n] = function () {
                    delete window[n], function () {
                        var n = function () {
                            switch (u()) {
                                case p:
                                    return window.grecaptcha;
                                case f:
                                    return window.grecaptcha.enterprise;
                                case d:
                                    return window.hcaptcha;
                                case m:
                                    return window.friendlyChallenge
                            }
                        }();
                        if (u() === m) var e = new n.WidgetInstance(i(), {
                            sitekey: c(),
                            language: a(),
                            doneCallback: function (n) {
                                l(n)
                            }
                        }); else var e = n.render(i(), {
                            sitekey: c(), "expired-callback": function () {
                                l(""), r(o, "c5c6e62c0"), n.reset(e)
                            }, callback: function (n) {
                                l(n), s(o, "c5c6e62c0")
                            }
                        })
                    }()
                };
                var e = {async: !0, defer: !0};
                u() === m && (e.onload = window[n]), t(function (n, e) {
                    switch (u()) {
                        case p:
                            return "https://www.recaptcha.net/recaptcha/api.js?render=explicit&hl=" + n + "&onload=" + e;
                        case f:
                            return "https://www.recaptcha.net/recaptcha/enterprise.js?render=explicit&hl=" + n + "&onload=" + e;
                        case d:
                            return "https://js.hcaptcha.com/1/api.js?render=explicit&hl=" + n + "&onload=" + e;
                        case m:
                            return "https://cdn.jsdelivr.net/npm/friendly-challenge@0.9.12/widget.min.js"
                    }
                }(a(), n), e)
            }()
        }, n.exports
    }

    function ulpFieldStyling() {
        var n = {};
        return n.exports = function (t, n, r, s, o, i, a, e) {
            var u = ["text", "number"].map(function (n) {
                return 'input[type="' + n + '"]'
            }).join(",") + ",select,textarea";

            function c(n) {
                var e = n.target, t = i(e);
                e.value ? s(t, "c4457bd38") : o(t, "c4457bd38")
            }

            function l(n) {
                var e = n.target, t = i(e);
                s(t, "focus")
            }

            function p(n) {
                var e = n.target, t = i(e);
                o(t, "focus")
            }

            function f() {
                n("[id^='ulp-container-'] .ulp-field").forEach(function (n) {
                    if (!a(n, "c22285f6b")) {
                        var e = t(n, u);
                        e && (s(n, "c22285f6b"), e.value && s(n, "c4457bd38"), r(e, "change", c), r(e, "focus", l), r(e, "blur", p))
                    }
                })
            }

            var d = n("[id^='ulp-container-']");
            if (d && d.length) {
                var m = e(f);
                if (m) for (var h = 0; h < d.length; h++) m.observe(d[h], {childList: !0, subtree: !0});
                f()
            }
        }, n.exports
    }

    var _utils = utils()(window, document), _passwordSheriffBundle = passwordSheriffBundle();
    showHidePassword()(_utils.querySelector, _utils.querySelectorAll, _utils.addClickListener, _utils.addClass, _utils.removeClass, _utils.toggleClass, _utils.getParent), passwordPolicies()(_passwordSheriffBundle, _utils.querySelector, _utils.querySelectorAll, _utils.getAttribute, _utils.setAttribute, _utils.removeClass, _utils.addClass, _utils.addEventListener, _utils.getGlobalFlag, _utils.setGlobalFlag, _utils.preventFormSubmit), inputFocus()(_utils.querySelector, _utils.querySelectorAll, _utils.addEventListener, _utils.addClass, _utils.removeClass, _utils.getParent, _utils.setTimeout, _utils.dispatchEvent, _utils.setAttribute, _utils.getAttribute), loadCaptcha()(_utils.loadScript, _utils.querySelector, _utils.addClass, _utils.removeClass), ulpFieldStyling()(_utils.querySelector, _utils.querySelectorAll, _utils.addEventListener, _utils.addClass, _utils.removeClass, _utils.getParent, _utils.hasClass, _utils.createMutationObserver)
}();