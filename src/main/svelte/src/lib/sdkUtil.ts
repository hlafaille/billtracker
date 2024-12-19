import {Configuration, ResponseError} from "$lib/sdk";

export let apiConfig = new Configuration({
    basePath: "http://localhost:8080",
})

export async function getErrorMessageFromSdk(error: ResponseError): Promise<string> {
    if (error.response) {
        // Extract and process the response body
        const errorBody = await error.response.json().catch(() => null); // Handle non-JSON responses
        // Add the error message to the error queue
        return errorBody?.message || "An unexpected error occurred";
    } else {
        // Handle network or other errors
        return error.message || "A network error occurred";
    }
}